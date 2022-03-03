package cn.zjf.demo1Project.dao;

import cn.zjf.demo1Project.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author OneBird
 * @date 2022/2/28 18:09
 **/
@Repository
public class UserDao {
    private static Map<String, User> userDao = new HashMap<>();

    static {
        userDao.put("hxg",new User(1,"hxg","147"));
        userDao.put("zxf",new User(2,"zxf","2365"));
        userDao.put("胡小哥",new User(3,"胡小哥","1234"));
        userDao.put("迪丽热巴",new User(4,"迪丽热巴","12345678"));
    }

    public User login(String username, String pwd){
        User user = userDao.get(username);
        if (user == null){
            return null;
        }
        if (user.getPwd().equals(pwd)){
            return user;
        }
        return null;
    }

    public List<User> userListr(){
        List<User> list = new ArrayList<>();
        list.addAll(userDao.values());
        return list;
    }
}
