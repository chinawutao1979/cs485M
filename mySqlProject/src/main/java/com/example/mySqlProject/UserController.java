package com.example.mySqlProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers() {
        List<User> list = userService.getAllUsers();
        User user = userService.getAllUserById(1L).orElseGet(() -> someMethodToCreateUser()); ;
        return list;
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    public static User someMethodToCreateUser() {
        User user = new User();
        user.setUsername("defaultUsername");
        user.setEmail("defaultEmail@example.com");
        return user;
    }
}

