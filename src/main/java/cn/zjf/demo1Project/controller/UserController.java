package cn.zjf.demo1Project.controller;

import cn.zjf.demo1Project.service.UserService;
import cn.zjf.demo1Project.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author OneBird
 * @date 2022/2/28 18:57
 **/
@RestController
@RequestMapping("/api/v1/pub/user")

public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/login")
    public JsonData login(String username, String pwd){
        System.out.println("username="+username+" pwd="+pwd);
        return JsonData.buildSuccess("");
    }
    @GetMapping("list")
    public JsonData listUser(){
        System.out.println(1234);
        System.out.println(569);
        return JsonData.buildSuccess(userService.userList());
    }
}
