package com.itheima.creator.prototype.shallow;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 09:46
 * @Description:
 */
public class Citation implements Cloneable{

    private Student student;


    public Citation() {
    }

    public Citation(Student student) {
        this.student = student;
    }


    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }

    public void show(){
        System.out.println(student.getName()+"被评为三好学生");
    }


    /**
     * 获取
     * @return student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * 设置
     * @param student
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    public String toString() {
        return "Citation{student = " + student + "}";
    }
}
