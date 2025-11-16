package com.eventUpdater.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventUpdater.sEntity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
