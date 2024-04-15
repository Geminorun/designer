package com.itheima.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 18:32
 * @Description:
 */
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
