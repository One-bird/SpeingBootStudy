package cn.zjf.demo1Project.controller;

import cn.zjf.demo1Project.utils.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author OneBird
 * @date 2022/3/4 21:55
 **/
@RestController
@RequestMapping("/api/v1/pri/order")
public class VideoOrdController {
    @RequestMapping("save")
    public JsonData saveOrder(){
        return JsonData.buildSuccess("下单成功");
    }
}
