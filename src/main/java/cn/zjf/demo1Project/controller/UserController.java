package cn.zjf.demo1Project.controller;

import cn.zjf.demo1Project.domain.User;
import cn.zjf.demo1Project.service.UserService;
import cn.zjf.demo1Project.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public JsonData login(@RequestBody User user){
        System.out.println("user=" + user.toString());
        String token = userService.login(user.getUsername(), user.getPwd());
        return token !=null ? JsonData.buildSuccess(token) : JsonData.buildError("账号密码错误");
//    public JsonData login(String username, String pwd){
//        User user = new User();
//        user.setPwd(pwd);
//        user.setUsername(username);
//        String s = userService.login(username, pwd);
//        return JsonData.buildSuccess(s);
    }
    @GetMapping("list")
    public JsonData listUser(){
        return JsonData.buildSuccess(userService.userList());
    }
}
