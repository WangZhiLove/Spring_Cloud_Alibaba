package com.wangzhi.rest;

import com.wangzhi.domain.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "cloud-alibaba-video-service")
@RequestMapping("/api/v1/video")
public interface VideoRestService {

    @GetMapping("/find_by_id/{id}")
    Video findById(@PathVariable(value = "id") Integer id);


    @PostMapping("/save")
    Integer saveVideo(@RequestBody Video video);

}
