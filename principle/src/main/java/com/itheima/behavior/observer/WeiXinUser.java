package com.itheima.behavior.observer;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 09:36
 * @Description:
 */
public class WeiXinUser implements Observer{

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"-"+ message);
    }
}
