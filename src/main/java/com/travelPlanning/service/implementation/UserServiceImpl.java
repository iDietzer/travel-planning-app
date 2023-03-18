package com.travelPlanning.service.implementation;

import com.travelPlanning.repository.appUser.UserRepository;
import com.travelPlanning.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
