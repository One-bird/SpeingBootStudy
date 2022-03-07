package cn.zjf.demo1Project.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * request创建监听
 * @author OneBird
 * @date 2022/3/5 19:55
 **/
@WebListener
public class CustomSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("==sessionCreated创建==");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("==sessionCreated销毁==");    }
}
