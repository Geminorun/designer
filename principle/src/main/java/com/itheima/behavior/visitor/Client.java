package com.itheima.behavior.visitor;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 19:32
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建Home对象
        Home home = new Home();
        home.add(new Dog());
        home.add(new Dog());
        home.add(new Cat());
        home.add(new Cat());
        home.add(new Cat());

        Owner owner = new Owner();
        home.action(owner);

    }
}
