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

  @PutMapping("/{userId}")
  public User modifyUser(@PathVariable String userId, User newUser) {
    return userService.modifyUser(userId, newUser);
  }

  @DeleteMapping("/{userId}")
  public User quitUser(@PathVariable String userId) {
    return userService.quitUser(userId);
  }

}
