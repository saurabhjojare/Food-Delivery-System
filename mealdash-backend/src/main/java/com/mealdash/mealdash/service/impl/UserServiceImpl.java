package com.mealdash.mealdash.service.impl;

import com.mealdash.mealdash.exception.GlobalExceptionHandler;
import com.mealdash.mealdash.model.User;
import com.mealdash.mealdash.repository.UserRepository;
import com.mealdash.mealdash.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(String id, User userDetails) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            throw new GlobalExceptionHandler.ResourceNotFoundException("User not found with id " + id);
        }
        User existingUser = optionalUser.get();
        existingUser.setName(userDetails.getName());
        existingUser.setEmail(userDetails.getEmail());
        existingUser.setPassword(userDetails.getPassword());
        existingUser.setPhoneNumber(userDetails.getPhoneNumber());
        existingUser.setRole(userDetails.getRole());

        return userRepository.save(existingUser);
    }

}
