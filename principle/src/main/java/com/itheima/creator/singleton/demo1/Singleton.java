package com.itheima.creator.singleton.demo1;

import java.io.Serializable;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 10:50
 * @Description:饿汉式
 */
public class Singleton implements Serializable {

    private Singleton(){
        if (instance!=null){
            throw new RuntimeException("不能创建重复实例");
        }
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
