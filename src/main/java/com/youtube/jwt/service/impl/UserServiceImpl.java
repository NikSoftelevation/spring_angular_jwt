package com.youtube.jwt.service.impl;

import com.youtube.jwt.entity.User;
import com.youtube.jwt.repository.UserRepository;
import com.youtube.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createNewUser(User user) {
        return userRepository.save(user);
    }
}
