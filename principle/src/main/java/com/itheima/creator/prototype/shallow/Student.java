package com.itheima.creator.prototype.shallow;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 09:54
 * @Description:
 */
public class Student {
    private String name;


    public Student() {
    }

    public Student(String name) {
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
        return "Student{name = " + name + "}";
    }
}
