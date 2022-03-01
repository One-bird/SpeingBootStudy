package cn.zjf.demo1Project.service;

import cn.zjf.demo1Project.domain.User;

import java.util.List;

/**
 * @author OneBird
 * @date 2022/2/28 18:12
 **/
public interface UserService {
    String login(String username, String pwd);
    List<User> userList();
}
