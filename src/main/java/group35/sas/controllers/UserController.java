package group35.sas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group35.sas.models.UserModel;
import group35.sas.service.UserService;
import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/user")
public class UserController {


    // UserModel newUser;
    // Logger logger = LoggerFactory.getLogger(UserController.class);
    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    // read specific user
    @GetMapping("{userId}") 
    public UserModel getUser(@PathVariable("userId") String userId){

        return userService.getUser(userId);
        // return new UserModel("12","21je1050@gmail.com",
        // "Vishal","12364761");
    }

    // read all users
    @GetMapping
    public List<UserModel> getAllUser(){
        return userService.getAllUsers();
    }


    @PostMapping
    public String createUser(@RequestBody UserModel userModel){
        userService.createUser(userModel);
        // logger.info(userModel.toString());
        // System.out.println(userModel.toString());
        return "User created";
    }

    @PutMapping
    public String updateUser(@RequestBody UserModel userModel) {;
        userService.updateUser(userModel);
        return "User updated successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
        return "User deleted successfully";
    }

}
