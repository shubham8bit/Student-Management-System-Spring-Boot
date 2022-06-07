package com.shb.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shb.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
