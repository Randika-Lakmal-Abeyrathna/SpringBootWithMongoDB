package com.randikalakmal.springbootwithmongo.repository;


import com.randikalakmal.springbootwithmongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,Integer> {

    Optional<User> findById(Integer id);

    void deleteById(Integer id);
}
