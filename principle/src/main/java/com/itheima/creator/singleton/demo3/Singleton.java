package com.itheima.creator.singleton.demo3;

import com.itheima.principles.demo5.Star;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 11:08
 * @Description:
 */
public class Singleton {
    private Singleton(){
    }
    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
