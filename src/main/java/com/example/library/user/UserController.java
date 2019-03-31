package com.example.library.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{userId}")
  public User getUser(@PathVariable String userId) {
    return userService.getUserById(userId);
  }

  @PostMapping
  public User createUser(User user) {
    return userService.createUser(user);
  }

  @PutMapping
  public User updateUser(User user) {
    return userService.updateUser(user);
  }

  @DeleteMapping("/{userId}")
  public User deleteUser(@PathVariable String userId) {
    return userService.deleteUser(userId);
  }

}
