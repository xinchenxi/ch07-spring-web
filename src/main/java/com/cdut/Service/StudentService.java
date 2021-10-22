package com.cdut.Service;

import com.cdut.entity.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);
    List<Student> AllStudents();
}
