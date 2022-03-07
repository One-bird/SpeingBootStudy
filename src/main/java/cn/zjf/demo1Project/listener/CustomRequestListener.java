package cn.zjf.demo1Project.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * request请求监听
 * @author OneBird
 * @date 2022/3/5 19:58
 **/
@WebListener
public class CustomRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("===requestDestroyed创建===");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("===requestDestroyed销毁===");
    }
}
