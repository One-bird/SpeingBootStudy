package cn.zjf.demo1Project.service.impl;

import cn.zjf.demo1Project.dao.VideoDao;
import cn.zjf.demo1Project.domain.Video;
import cn.zjf.demo1Project.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OneBird
 * @date 2022/2/28 17:54
 **/
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDao videoDao;

    @Override
    public List<Video> listVideo() {
        videoDao.listVideo();
        return null;
    }
}
