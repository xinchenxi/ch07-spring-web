package com.cdut.controller;

import com.cdut.Service.StudentService;
import com.cdut.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegsterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String age=request.getParameter("age");

        String config= "spring.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        System.out.println("容器对象的信息"+ac);
        StudentService service= (StudentService) ac.getBean("StudentService");
        Student student=new Student();
        student.setId(Integer.parseInt(id));
        student.setName(name);
        student.setEmail(email);
        student.setAge(Integer.valueOf(age));
        service.addStudent(student);

        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
