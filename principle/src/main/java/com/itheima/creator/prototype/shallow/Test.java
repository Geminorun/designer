package com.itheima.creator.prototype.shallow;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 09:47
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation1 = new Citation();
        Student student = new Student("张三");
        citation1.setStudent(student);
        Citation citation2 = citation1.clone();

        student.setName("李四");

        citation1.show();
        citation2.show();

    }
}
