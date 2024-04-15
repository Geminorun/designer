package com.itheima.principles.demo5;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 10:12
 * @Description:
 */
public class Fans {
    private String name;


    public Fans() {
    }

    public Fans(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Fans{name = " + name + "}";
    }
}
