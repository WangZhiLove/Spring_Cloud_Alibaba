package com.wangzhi.controller;

import com.wangzhi.domain.Video;
import com.wangzhi.rest.VideoRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @LoadBalanced
    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    private VideoRestService videoRestService;

/*    @Autowired
    public OrderController(RestTemplate restTemplate, VideoRestService videoRestService) {
        this.restTemplate = restTemplate;
        this.videoRestService = videoRestService;
    }*/

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @GetMapping("/get_by_id/{id}")
    public Video getById(@PathVariable Integer id) {
//        return restTemplate.getForObject("http://cloud-alibaba-video-service/api/v1/video/find_by_id/" + id, Video.class);
        return videoRestService.findById(id);
    }

    @GetMapping("/call/echo/{message}")
    public String callEcho(@PathVariable String message) {
        // 访问应用 nacos-discovery-provider 的 REST "/echo/{message}"
        return restTemplate.getForObject("http://cloud-alibaba-video-service/api/v1/video/echo/" + message, String.class);
    }

    @PostMapping("/save")
    public Integer saveVideo(@RequestBody Video video) {
        return videoRestService.saveVideo(video);
    }

}
