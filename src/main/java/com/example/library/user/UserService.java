package com.example.library.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(String userId) {
    return userRepository.findByUserId(userId);
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public User modifyUser(String userId, User newUser) {
    User oldUser = getUserById(userId);
    oldUser.setName(newUser.getName());
    oldUser.setPhoneNumber(newUser.getPhoneNumber());
    return userRepository.save(oldUser);
  }

  public User quitUser(String userId) {
    User user = getUserById(userId);
    user.setQuitDateTime(LocalDateTime.now());
    return userRepository.save(user);
  }

}
