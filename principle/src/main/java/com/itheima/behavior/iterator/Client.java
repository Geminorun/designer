package com.itheima.behavior.iterator;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 18:34
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三", "001"));
        studentAggregate.addStudent(new Student("李四", "002"));

        StudentIterator iterator = studentAggregate.getStudentIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
