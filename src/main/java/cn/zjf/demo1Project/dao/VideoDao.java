package cn.zjf.demo1Project.dao;

import cn.zjf.demo1Project.domain.User;
import cn.zjf.demo1Project.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author OneBird
 * @date 2022/2/28 17:56
 **/
@Repository
public class VideoDao {
    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1,"Java基础课程"));
        videoMap.put(2,new Video(1,"Java基础课程"));
        videoMap.put(3,new Video(1,"Java基础课程"));
        videoMap.put(4,new Video(1,"Java基础课程"));
        videoMap.put(5,new Video(1,"Java基础课程"));
    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }
}
