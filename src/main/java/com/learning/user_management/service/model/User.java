package com.learning.user_management.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class User {

  private String firstName;
  private String lastname;
  private String userID;

}
