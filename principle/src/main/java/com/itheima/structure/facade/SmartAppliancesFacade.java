package com.itheima.structure.facade;

import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 11:03
 * @Description:
 */
public class SmartAppliancesFacade {
    private Light light;

    private TV tv;

    public SmartAppliancesFacade() {
        light = new Light();
        tv=new TV();
    }

    public void say(String message){
        if (message.contains("打开")){
            on();
        }else if(message.contains("关闭")){
            off();
        }else {
            System.out.println("我听不懂你在说什么");
        }
    }

    private void on(){
        light.on();
        tv.on();
    }

    private void off(){
        light.off();
        tv.off();
    }
}
