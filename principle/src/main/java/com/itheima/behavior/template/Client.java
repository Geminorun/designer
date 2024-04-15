package com.itheima.behavior.template;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 18:57
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreateClass_Egg();
        abstractClass.cookProcess();
    }
}
