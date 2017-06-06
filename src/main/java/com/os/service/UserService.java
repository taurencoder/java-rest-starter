package com.os.service;

import com.os.model.entity.User;
import com.os.model.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dqin on 6/6/2017.
 */
@Component
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

    public User createNewUser(User user) {
        logger.info("Creating new user: {}", user.toString());
        return userRepository.save(user);
    }
}
