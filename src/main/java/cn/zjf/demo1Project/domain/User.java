package cn.zjf.demo1Project.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author OneBird
 * @date 2022/2/28 18:06
 **/
public class User {
    private int id;
    private String username;
//    @JsonIgnore
    private String pwd;

    public User(int id, String username, String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
