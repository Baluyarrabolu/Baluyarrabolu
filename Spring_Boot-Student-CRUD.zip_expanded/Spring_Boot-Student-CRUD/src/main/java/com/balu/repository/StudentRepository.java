package com.balu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.balu.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {}
