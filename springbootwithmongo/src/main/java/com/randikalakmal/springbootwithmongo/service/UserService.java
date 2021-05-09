package com.randikalakmal.springbootwithmongo.service;

import com.randikalakmal.springbootwithmongo.Exception.UserException;
import com.randikalakmal.springbootwithmongo.model.User;
import com.randikalakmal.springbootwithmongo.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User getUserByID(Integer id){
        return userRepository.findById(id)
                .orElseThrow(()-> new UserException("User Not Found"));
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
