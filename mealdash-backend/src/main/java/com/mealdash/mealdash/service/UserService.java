package com.mealdash.mealdash.service;

import com.mealdash.mealdash.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User updateUser(String id, User user);
}
