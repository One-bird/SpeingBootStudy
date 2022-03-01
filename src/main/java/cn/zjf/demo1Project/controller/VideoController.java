package cn.zjf.demo1Project.controller;

import cn.zjf.demo1Project.dao.VideoDao;
import cn.zjf.demo1Project.domain.Video;
import cn.zjf.demo1Project.utils.JsonData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public JsonData list() throws JsonProcessingException {
        List<Video> list = new ArrayList<>(videoDao.listVideo());
        return JsonData.buildSuccess(list);
    }

    @PostMapping("save_video")
    public JsonData saveVideo(@RequestBody Video video){
        System.out.println(video.toString());
        return JsonData.buildSuccess("");
    }

}
