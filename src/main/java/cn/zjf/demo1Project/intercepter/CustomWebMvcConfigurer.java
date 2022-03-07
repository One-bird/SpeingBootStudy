package cn.zjf.demo1Project.intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置类
 * @author OneBird
 * @date 2022/3/6 9:45
 **/
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/api/v1/pri/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
