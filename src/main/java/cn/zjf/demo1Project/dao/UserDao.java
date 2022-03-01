package cn.zjf.demo1Project.dao;

import cn.zjf.demo1Project.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OneBird
 * @date 2022/2/28 18:09
 **/
public class UserDao {
    private static Map<Integer, User> user = new HashMap<>();

    static {
        user.put(1,new User(1,"hxg","147"));
        user.put(2,new User(2,"zxf","2365"));
        user.put(3,new User(3,"胡小哥","1234"));
        user.put(4,new User(4,"迪丽热巴","12345678"));
    }
}
