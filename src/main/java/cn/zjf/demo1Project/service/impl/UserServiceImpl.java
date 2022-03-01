package cn.zjf.demo1Project.service.impl;

import cn.zjf.demo1Project.dao.UserDao;
import cn.zjf.demo1Project.domain.User;
import cn.zjf.demo1Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author OneBird
 * @date 2022/2/28 18:12
 **/
@Service
public class UserServiceImpl implements UserService {

    private static Map<String,User> sessionMap = new HashMap<>();

    @Autowired
    private UserDao userDao;

    /**
     * 登录接口
     * @param username
     * @param pwd
     * @return
     */
    @Override
    public String login(String username, String pwd) {
        User user = userDao.login(username,pwd);
        if(user == null){
            return null;
        }else {
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }
    }

    /**
     * 列出全部用户
     */
    @Override
    public List<User> userList() {
        return userDao.userListr();
    }
}
