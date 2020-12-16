package com.wangzhi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.wangzhi.mapper.VideoMapper;
import com.wangzhi.domain.Video;
import com.wangzhi.service.VideoService;
@Service
public class VideoServiceImpl implements VideoService{

    @Resource
    private VideoMapper videoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return videoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Video record) {
        return videoMapper.insert(record);
    }

    @Override
    public int insertSelective(Video record) {
        return videoMapper.insertSelective(record);
    }

    @Override
    public Video selectByPrimaryKey(Integer id) {
        return videoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Video record) {
        return videoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Video record) {
        return videoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Video> list) {
        return videoMapper.batchInsert(list);
    }

}
