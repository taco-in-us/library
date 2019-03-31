package com.example.library.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
  private String id;
  private String name;
  private String phoneNumber;
  private LocalDateTime joinDateTime;
  private LocalDateTime quitDateTime;
}
