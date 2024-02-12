package Fusi.Green2.controller;

import Fusi.Green2.User.User;
import Fusi.Green2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody  User user){
        userService.saveUser(user);
        return("User saved");
    }
    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getUssers();
    }

}
