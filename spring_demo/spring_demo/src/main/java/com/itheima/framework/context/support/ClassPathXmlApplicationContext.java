package com.itheima.framework.context.support;

import com.itheima.framework.beans.BeanDefinition;
import com.itheima.framework.beans.MutablePropertyValues;
import com.itheima.framework.beans.PropertyValue;
import com.itheima.framework.beans.factory.support.XmlBeanDefinitionReader;
import com.itheima.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 13:58
 * @Description:
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;

        // 构建解析器对象
        reader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        }catch (Exception e){

        }
    }

    /**
     * @param:
     * @return:
     * @auther: lyl
     * @date: 2024/3/4 14:01
     * 功能描述: 根据对象bean名称获取对象
     */
    @Override
    public Object getBean(String name) throws Exception {

        Object obj = this.stringObjectMap.get(name);
        if (obj!=null){
            return obj;
        }

        BeanDefinition beanDefinition = reader.getRegister().getBeanDefinition(name);

        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();

        //进行依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();

            if (ref!=null && !"".equals(ref)){
                Object bean = getBean(ref);
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (methodName.equals(method.getName())){
                        method.invoke(beanObj,bean);
                    }
                }
            }

            if (value!=null && !"".equals(ref)){
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);

                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj,value);
            }

        }

        stringObjectMap.put(name, beanObj);

        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean==null){
            return null;
        }
        return clazz.cast(bean);
    }
}
