package com.wangzhi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.wangzhi.domain.VideoOrder;
import com.wangzhi.mapper.VideoOrderMapper;
import com.wangzhi.service.VideoOrderService;
@Service
public class VideoOrderServiceImpl implements VideoOrderService{

    @Resource
    private VideoOrderMapper videoOrderMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return videoOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(VideoOrder record) {
        return videoOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(VideoOrder record) {
        return videoOrderMapper.insertSelective(record);
    }

    @Override
    public VideoOrder selectByPrimaryKey(Integer id) {
        return videoOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(VideoOrder record) {
        return videoOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(VideoOrder record) {
        return videoOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<VideoOrder> list) {
        return videoOrderMapper.batchInsert(list);
    }

}
