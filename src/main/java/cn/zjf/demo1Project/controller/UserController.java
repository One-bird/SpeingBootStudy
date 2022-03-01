package cn.zjf.demo1Project.controller;

import cn.zjf.demo1Project.utils.JsonData;
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
    @PostMapping("/login")
    public JsonData login(String username, String pwd){
        System.out.println("username="+username+" pwd="+pwd);
        return JsonData.buildSuccess("");
    }
}
