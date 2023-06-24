package com.prince.studentsystem.service;

import com.prince.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();


}
