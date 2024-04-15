package com.itheima.framework.beans.factory.support;

import com.itheima.framework.beans.BeanDefinition;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 09:52
 * @Description:
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    void removeBeanDefinition(String beanName) throws RuntimeException;

    BeanDefinition getBeanDefinition(String beanName) throws RuntimeException;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
