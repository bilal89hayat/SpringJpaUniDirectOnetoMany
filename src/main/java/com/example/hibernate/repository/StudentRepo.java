package com.example.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernate.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
