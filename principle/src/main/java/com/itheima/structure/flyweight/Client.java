package com.itheima.structure.flyweight;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 18:17
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("白色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("I");
        box2.display("蓝色");

        System.out.println(box1 == box2);
    }
}
