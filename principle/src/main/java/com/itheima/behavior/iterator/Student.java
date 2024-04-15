package com.itheima.behavior.iterator;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 18:26
 * @Description:
 */
public class Student {
    private String name;
    private String number;


    public Student() {
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
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

    /**
     * 获取
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return "Student{name = " + name + ", number = " + number + "}";
    }
}
