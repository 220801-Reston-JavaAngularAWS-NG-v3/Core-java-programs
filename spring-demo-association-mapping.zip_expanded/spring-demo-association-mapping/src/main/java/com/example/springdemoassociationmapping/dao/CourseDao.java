package com.example.springdemoassociationmapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemoassociationmapping.entity.CourseEntity;

@Repository
public interface CourseDao extends JpaRepository<CourseEntity, Integer>{

}
