package cn.zjf.demo1Project.controller;

import cn.zjf.demo1Project.dao.VideoDao;
import cn.zjf.demo1Project.domain.Video;
import cn.zjf.demo1Project.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OneBird
 * @date 2022/2/28 18:15
 **/
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoDao videoDao;

    // @RequestMapping(value = "list",method = RequestMethod.GET)作用同下
    @GetMapping("list")
    public Object list(){
        List<Video> list = new ArrayList<>(videoDao.listVideo());
        return JsonData.buildSuccess(list);
    }

}
