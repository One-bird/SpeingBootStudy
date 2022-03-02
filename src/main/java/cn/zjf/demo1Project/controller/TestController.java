package cn.zjf.demo1Project.controller;

import cn.zjf.demo1Project.config.WXConfig;
import cn.zjf.demo1Project.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OneBird
 * @date 2022/3/2 10:21
 **/
@RestController
@RequestMapping("/api/v1/test")
@PropertySource({"classpath:pay.properties"})
public class TestController {
    @Value("${wxpay.appid}")
    private String payAppid;

    @Value("${wxpay.secret}")
    private String paySecret;

    @Autowired
    private WXConfig wxConfig;
    @GetMapping("get_config")
    public JsonData testConfig(){
        Map<String,String> map = new HashMap<>();
//        map.put("appid",payAppid);
//        map.put("secret",paySecret);
        map.put("appid", wxConfig.getPayAppid());
        map.put("secret", wxConfig.getPaySecret());
        map.put("mechid", wxConfig.getPayMechId());

        return JsonData.buildSuccess(map);
    }
}
