package com.example.springmvc.training;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private String label;
    private List<Student> studentList;

    public StudentList(String label){
        this.label = label;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
