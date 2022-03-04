package cn.zjf.demo1Project.filter;


import cn.zjf.demo1Project.domain.User;
import cn.zjf.demo1Project.service.impl.UserServiceImpl;
import cn.zjf.demo1Project.utils.JsonData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.thymeleaf.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author OneBird
 * @date 2022/3/4 21:46
 **/
@WebFilter(urlPatterns = "/api/v1/pri/*",filterName = "loginFilter")
public class LoginFilter implements Filter {
    public static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)){
            token = request.getParameter("token");
        }

        if (!StringUtils.isEmpty(token)){
            User user = UserServiceImpl.sessionMap.get(token);
            if (user!=null){
                filterChain.doFilter(servletRequest,servletResponse);
            }else {
                JsonData jsonData = JsonData.buildError("登录失败，token无效", -2);
                String jsonStr = objectMapper.writeValueAsString(jsonData);
                renderJson(response,jsonStr);
            }
        }else {
            JsonData jsonData = JsonData.buildError("未登录", -3);
            String jsonStr = objectMapper.writeValueAsString(jsonData);
            renderJson(response,jsonStr);
        }
    }
    private void renderJson(HttpServletResponse response,String json){
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        try(PrintWriter writer = response.getWriter()){
            writer.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
