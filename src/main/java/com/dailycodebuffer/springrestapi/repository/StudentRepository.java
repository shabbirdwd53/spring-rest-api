package com.dailycodebuffer.springrestapi.repository;

import com.dailycodebuffer.springrestapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

     Student findByEmailId(String emailId);
}
