package com.itheima.behavior.mediator;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 10:37
 * @Description:
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String msg){
        mediator.constact(msg,this);
    }

    public void getMessage(String message){
        System.out.println("房主"+name+"获取到的信息是："+message);
    }

}
