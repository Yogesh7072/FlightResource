package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.passangerData;
@Repository
public interface PassangerRepo extends JpaRepository<passangerData, Integer> {

}
