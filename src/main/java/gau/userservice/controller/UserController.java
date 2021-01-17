package gau.userservice.controller;

import gau.userservice.model.User;
import gau.userservice.servce.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    UserServiceImpl userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.findAll();
    }
}
