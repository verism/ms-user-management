package com.learning.user_management.controller;

import com.learning.user_management.service.UserService;
import com.learning.user_management.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {

  @Autowired
  UserService userService;

  @GetMapping("/user/{userid}")
  public User user(@PathVariable("userid") String userID) {
    System.out.println("User ID in controller ::  :: "+userID);
    return userService.getUser("ravguptaa");
  }



}
