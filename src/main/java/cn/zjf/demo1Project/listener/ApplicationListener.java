package cn.zjf.demo1Project.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;

/**
 * 应用上下文监听器
 * @author OneBird
 * @date 2022/3/5 18:02
 **/
@WebListener
public class ApplicationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("=====初始化======");
        ServletContextListener.super.contextInitialized(sce);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("=====销毁======");
        ServletContextListener.super.contextDestroyed(sce);
    }
}
