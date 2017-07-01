package com.techprimers.mongodb.springbootmongodbexample.repository;

import com.techprimers.mongodb.springbootmongodbexample.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
