package com.wangzhi.controller;

import com.wangzhi.domain.Video;
import com.wangzhi.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    private VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/find_by_id")
    public Video findById(@RequestParam(value = "id", required = true) Integer id) {
        return videoService.selectByPrimaryKey(id);
    }
}
