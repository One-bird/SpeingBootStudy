package cn.zjf.demo1Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author 奔跑的少年
 */
@SpringBootApplication
@ServletComponentScan
public class Demo1ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1ProjectApplication.class, args);
	}

}
