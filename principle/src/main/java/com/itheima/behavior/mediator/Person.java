package com.itheima.behavior.mediator;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 10:34
 * @Description:
 */
public abstract class Person {
    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
