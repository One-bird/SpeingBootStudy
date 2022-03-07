package cn.zjf.demo1Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 奔跑的少年
 */
@SpringBootApplication
@ServletComponentScan
//定时任务
@EnableScheduling
//异步请求
@EnableAsync
public class Demo1ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1ProjectApplication.class, args);
	}

}
