package com.wangzhi.controller;

import com.wangzhi.domain.Video;
import com.wangzhi.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    private VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/find_by_id/{id}")
    public Video findById(@PathVariable Integer id) {
        return videoService.selectByPrimaryKey(id);
    }

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return "[ECHO] : " + message;
    }

    @PostMapping("/save")
    public Integer saveVideo(@RequestBody Video video) {
        return videoService.insert(video);
    }
}
