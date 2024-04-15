package com.itheima.creator.singleton.demo4;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 11:18
 * @Description:
 */
public class Singleton {
    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
