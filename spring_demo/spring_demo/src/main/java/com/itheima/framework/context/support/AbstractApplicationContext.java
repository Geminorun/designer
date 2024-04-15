package com.itheima.framework.context.support;

import com.itheima.framework.beans.factory.support.BeanDefinitionReader;
import com.itheima.framework.beans.factory.support.BeanDefinitionRegistry;
import com.itheima.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 12:46
 * @Description:
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

   protected BeanDefinitionReader reader;

   protected Map<String,Object> stringObjectMap = new HashMap<>();

   protected String configLocation;

    @Override
    public void refresh() throws Exception {
        reader.loadBeanDefinitions(configLocation);
        finishBeanInitlization();
    }

    private void finishBeanInitlization() throws Exception{
        BeanDefinitionRegistry register = reader.getRegister();
        String[] beanDefinitionNames = register.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = getBean(beanDefinitionName);
        }

    }

}
