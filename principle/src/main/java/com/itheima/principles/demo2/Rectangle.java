package com.itheima.principles.demo2;

/**
 * @Auther: lyl
 * @Date: 2024/1/23 14:10
 * @Description:
 */
public class Rectangle implements Quadrlateral {
    private double length;
    private double width;


    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * 获取
     * @return length
     */
    @Override
    public double getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 获取
     * @return width
     */
    @Override
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle{length = " + length + ", width = " + width + "}";
    }
}
