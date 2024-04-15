package com.itheima.framework.context;

import com.itheima.framework.beans.factory.BeanFactory;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 12:43
 * @Description:
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;

}
