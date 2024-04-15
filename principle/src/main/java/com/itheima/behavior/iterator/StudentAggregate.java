package com.itheima.behavior.iterator;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 18:30
 * @Description:
 */
public interface StudentAggregate {

    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
