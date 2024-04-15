package com.itheima.creator.singleton.demo2;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 10:58
 * @Description:
 */
public class Singleton2 {
    private Singleton2(){

    }

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public Singleton2 getInstance(){
        return instance;
    }

}
