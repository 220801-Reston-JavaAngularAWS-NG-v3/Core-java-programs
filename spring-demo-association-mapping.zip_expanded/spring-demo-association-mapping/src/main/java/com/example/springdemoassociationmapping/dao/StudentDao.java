package com.example.springdemoassociationmapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemoassociationmapping.entity.StudentEntity;

@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Integer>{

}
