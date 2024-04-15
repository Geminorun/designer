package com.itheima.principles.demo2;

/**
 * @Auther: lyl
 * @Date: 2024/1/23 14:11
 * @Description:
 */
public class Square implements Quadrlateral{
    private double length;
    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    public String toString() {
        return "Square{length = " + length + ", width = " + width + "}";
    }
}
