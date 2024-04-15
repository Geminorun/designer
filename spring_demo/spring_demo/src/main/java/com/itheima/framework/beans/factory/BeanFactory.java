package com.itheima.framework.beans.factory;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 12:18
 * @Description:
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

    <T> T getBean(String name, Class<? extends  T> clazz) throws Exception;

}
