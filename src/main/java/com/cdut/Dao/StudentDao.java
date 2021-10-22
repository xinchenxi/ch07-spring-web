package com.cdut.Dao;

import com.cdut.entity.Student;
import java.util.List;

public interface StudentDao {

    public int insertStudent(Student student);
    public List<Student> selectStudents();

}
