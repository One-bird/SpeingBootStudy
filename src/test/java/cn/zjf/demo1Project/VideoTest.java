package cn.zjf.demo1Project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.servlet.http.Cookie;
import java.nio.charset.Charset;

/**
 * @author OneBird
 * @date 2022/3/2 10:48
 **/
//底层⽤junit SpringJUnit4ClassRunner
@RunWith(SpringRunner.class)
//启动整个springboot⼯程
@SpringBootTest(classes = {Demo1ProjectApplication.class})
@AutoConfigureMockMvc
public class VideoTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVideoListApi() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/pub/video/list"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);
        String contentAsString = mvcResult.getResponse().getContentAsString(Charset.forName("utf-8"));
        System.out.println(contentAsString);
        Cookie[] cookies = mvcResult.getResponse().getCookies();
        for (Cookie cookie : cookies) {
            //cookie为空
            System.out.println(cookie);
        }
    }

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
