package com.example.springmvc.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
public class JSONController {

    @GetMapping("/students")
    public @ResponseBody
    StudentList getStudents() {
        StudentList studentList = new StudentList("the best");
        studentList.addStudent(new Student("Adam", "Janicki"));
        studentList.addStudent(new Student("Paweł", "Switalla"));
        studentList.addStudent(new Student("Michał", "Kozakiewicz"));
        return studentList;
    }
}
