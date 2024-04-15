package com.itheima.behavior.visitor;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 19:24
 * @Description:
 */
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
