package com.itheima.behavior.mediator;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 10:35
 * @Description:
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String msg){
        mediator.constact(msg,this);
    }

    public void getMessage(String message){
        System.out.println("租房者"+name+"获取到的信息是："+message);
    }
}
