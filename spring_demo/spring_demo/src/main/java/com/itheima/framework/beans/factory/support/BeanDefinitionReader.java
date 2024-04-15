package com.itheima.framework.beans.factory.support;

import com.itheima.framework.beans.BeanDefinition;
import org.dom4j.DocumentException;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 10:02
 * @Description:解析配置文件，定义规范
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegister();

    void loadBeanDefinitions(String configLocation) throws Exception;


}
