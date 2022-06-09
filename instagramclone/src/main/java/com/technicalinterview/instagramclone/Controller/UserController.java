package com.technicalinterview.instagramclone.Controller;

import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService; //강의에서는 필드주입이라 생성자 주입으로 바꿈꿈

   @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    private Users submitUser(@RequestBody Users users){
        return userService.submitMetaDataOfUser(users);
    }

    @GetMapping("/{userId}")
    private Users getUserDetails(@PathVariable("userId") String userId){
        return userService.displayUserMetaData(userId);
    }

}
