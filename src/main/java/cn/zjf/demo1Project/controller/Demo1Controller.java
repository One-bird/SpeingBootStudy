package cn.zjf.demo1Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OneBird
 * @date 2022/2/27 20:43
 **/
@RestController
@RequestMapping("api/v1/video")
public class Demo1Controller {
    @RequestMapping("list")
    public Object list(){
        Map<String,String> map = new HashMap<>();
        map.put("1","面试专题课程");
        map.put("2","SpringBoot");
        return map;
    }
}
