package cn.zjf.demo1Project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author OneBird
 * @date 2022/3/2 10:48
 **/
//底层⽤junit SpringJUnit4ClassRunner
@RunWith(SpringRunner.class)
//启动整个springboot⼯程
@SpringBootTest(classes = {Demo1ProjectApplication.class})
public class VideoTest {
    @Before
    public void before(){
        System.out.println("before");
    }

    @Test
    public void test(){
        System.out.println("test");
        //断言
        TestCase.assertEquals(1,1);
        Assert.assertEquals(1,5);
    }

    @After
    public void after(){
        System.out.println("ater");
    }
}
