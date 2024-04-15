package com.itheima.creator.singleton.demo5;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 11:27
 * @Description:
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public Singleton getInstance(){
        return  SingletonHolder.INSTANCE;
    }
}
