package com.os.controller;

import com.os.model.entity.User;
import com.os.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by dqin on 6/6/2017.
 */
@RestController
@RequestMapping(ApiController.USER_URL)
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public User signUp(@Validated @RequestBody User user, HttpServletResponse response) {
        User savedUser = userService.createNewUser(user);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return savedUser;
    }
}
