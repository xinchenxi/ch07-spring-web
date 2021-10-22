package com.cdut.Service.Impl;

import com.cdut.Dao.StudentDao;
import com.cdut.Service.StudentService;
import com.cdut.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao=null;

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public int addStudent(Student student) {
        return dao.insertStudent(student);
    }

    @Override
    public List<Student> AllStudents() {

        return dao.selectStudents();
    }
}
