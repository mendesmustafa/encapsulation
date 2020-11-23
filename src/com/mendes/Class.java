package com.mendes;

import java.util.Arrays;

/**
 * Created by mendesmustafa on 22.11.2020.
 */

public class Class {

    private String schoolName;
    private String className;
    private Student[] students;
    private int availableStudent = 0;

    public Class(String schoolName, String className, int classSize) {
        this.schoolName = schoolName;
        this.className = className;
        this.students = new Student[classSize];
    }

    public void saveStudent(Student student) {
        if (availableStudent >= students.length) {
            System.out.println("Sınıf dolu");
        } else {
            students[availableStudent] = student;
            availableStudent++;
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "schoolName='" + schoolName + '\'' +
                ", className='" + className + '\'' +
                ", students=" + Arrays.toString(students) +
                ", availableStudent=" + availableStudent +
                '}';
    }
}

