package com.dailycodebuffer.springrestapi.service;

import com.dailycodebuffer.springrestapi.entity.Student;
import com.dailycodebuffer.springrestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByEmailId(String emailId) {
        return studentRepository.findByEmailId(emailId);
    }

    @Override
    public String deleteStudent(Long studentId) {
         studentRepository.deleteById(studentId);
         return "Student deleted with StudentId: " + studentId;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }


}
