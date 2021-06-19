package com.learning.user_management.service.serviceImpl;

import com.learning.user_management.service.UserService;
import com.learning.user_management.service.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public User getUser(String userID) {
    return new User("Ravi", "Gupta","ravgupta");
  }
}
