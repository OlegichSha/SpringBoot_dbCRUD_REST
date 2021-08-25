package com.example.db.service;

import com.example.db.entity.User;
import com.example.db.repository.IUserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static java.util.Objects.isNull;

@Service
@Data
public class ServiceUserImp implements IServiceUser {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User addUser(User user) {
        if(isNull(user)){
            throw new NullPointerException();
        }
        return userRepository.save(user);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<User> addAllUsers(Iterable<User> users) {
        if(isNull(users)){
            throw new NullPointerException();
        }
        return userRepository.saveAll(users);
    }
}
