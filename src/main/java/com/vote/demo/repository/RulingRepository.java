package com.vote.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vote.demo.model.Ruling;

public interface RulingRepository extends MongoRepository<Ruling, String> {
    
    List<Ruling> findAll();
}
