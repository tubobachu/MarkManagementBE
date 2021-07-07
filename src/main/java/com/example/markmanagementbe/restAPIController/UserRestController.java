package com.example.markmanagementbe.restAPIController;

import com.example.markmanagementbe.model.User;
import com.example.markmanagementbe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserRestController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAlls(){
        return userRepository.findAll();
    }
    @GetMapping("/user")
    public User getUserByData(@RequestParam(name = "username") String username,
                              @RequestParam(name = "password") String password){
        return userRepository.getUserByPasswordEqualsAndUserNameEquals(password,username);
    }
    @PostMapping("/user")
    public ResponseEntity addUser(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.ok().body(user);
    }
}
