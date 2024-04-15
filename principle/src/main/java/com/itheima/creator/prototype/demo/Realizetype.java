package com.itheima.creator.prototype.demo;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 09:30
 * @Description:
 */
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("创建成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return (Realizetype) super.clone();
    }
}
