package cn.zjf.demo1Project.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * 定时统金额
 * @author OneBird
 * @date 2022/3/6 19:52
 **/
@Component
public class VideoOrderTask {
    @Scheduled(fixedRate = 2000)
//    @Scheduled(cron = "")
    //每两秒执行一次
    public void sum(){
        System.out.println(LocalDateTime.now() + "当前交易金额=" + new Random().nextInt(100));
    }
}
