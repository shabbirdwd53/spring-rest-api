package com.dailycodebuffer.springrestapi.service;

import com.dailycodebuffer.springrestapi.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    List<Student> getAllStudent();

    Student getStudentByEmailId(String emailId);

    String deleteStudent(Long studentId);

    Student updateStudent(Student student);
}
