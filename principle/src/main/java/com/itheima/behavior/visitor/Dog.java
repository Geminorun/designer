package com.itheima.behavior.visitor;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 19:25
 * @Description:
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("汪汪汪");
    }
}
