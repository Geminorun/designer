package com.itheima.behavior.iterator;

import java.util.List;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 18:28
 * @Description:
 */
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;

    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
