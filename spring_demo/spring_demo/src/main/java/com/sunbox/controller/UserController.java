package com.sunbox.controller;

import com.itheima.framework.context.ApplicationContext;
import com.itheima.framework.context.support.ClassPathXmlApplicationContext;
import com.sunbox.service.UserService;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 14:21
 * @Description:
 */
public class UserController {
    public static void main(String[] args) throws Exception {
        //创建spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从IOC容器中获取UserService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //调用UserService对象的add方法
        userService.add();
    }
}
