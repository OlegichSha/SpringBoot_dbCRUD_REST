package com.example.db.service;

import com.example.db.entity.User;

public interface IServiceUser {
    User addUser(User user);
    Iterable<User> findAll();
    Iterable<User> addAllUsers(Iterable<User> users);
}
