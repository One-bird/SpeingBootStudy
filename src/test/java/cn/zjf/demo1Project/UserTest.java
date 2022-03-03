package cn.zjf.demo1Project;

import cn.zjf.demo1Project.controller.UserController;
import cn.zjf.demo1Project.domain.User;
import cn.zjf.demo1Project.utils.JsonData;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author OneBird
 * @date 2022/3/3 20:23
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Demo1ProjectApplication.class})
public class UserTest {
    @Autowired
    private UserController userController;

    @Test
    public void loginTest(){
        User user = new User();
        user.setUsername("hxg");
        user.setPwd("147");
        JsonData jsonData  = userController.login(user);
        System.out.println(jsonData.toString());
        TestCase.assertEquals(0,jsonData.getCode());
    }
}
