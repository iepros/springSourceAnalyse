package com.xfma.spring.test.entity;

import lombok.Data;

/**
 * @author mxf
 * @version 1.0
 */
@Data
public class Student {

    private String studentName;

    private Integer age;

    public Student(String studentName, Integer age) {
        this.studentName = studentName;
        this.age = age;
    }

    public Student() {
    }
}
