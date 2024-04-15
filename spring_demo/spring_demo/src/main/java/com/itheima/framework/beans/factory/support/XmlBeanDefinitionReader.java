package com.itheima.framework.beans.factory.support;

import com.itheima.framework.beans.BeanDefinition;
import com.itheima.framework.beans.MutablePropertyValues;
import com.itheima.framework.beans.PropertyValue;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 10:04
 * @Description:
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader{

    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegister();
    }

    @Override
    public BeanDefinitionRegistry getRegister() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        SAXReader reader = new SAXReader();
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        Element rootElement = document.getRootElement();
        List<Element> beanElements = rootElement.elements("bean");

        for (Element bean : beanElements) {
            String id = bean.attributeValue("id");
            String className = bean.attributeValue("class");

            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            List<Element> propertyElements = bean.elements("property");
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref  = propertyElement.attributeValue("ref");
                String value  = propertyElement.attributeValue("value");

                PropertyValue propertyValue = new PropertyValue(name,ref,value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            beanDefinition.setPropertyValues(mutablePropertyValues);
            registry.registerBeanDefinition(id, beanDefinition);
        }

    }
}
