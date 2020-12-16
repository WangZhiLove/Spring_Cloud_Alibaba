package com.wangzhi.service;

import java.util.List;
import com.wangzhi.domain.VideoOrder;
public interface VideoOrderService{


    int deleteByPrimaryKey(Integer id);

    int insert(VideoOrder record);

    int insertSelective(VideoOrder record);

    VideoOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoOrder record);

    int updateByPrimaryKey(VideoOrder record);

    int batchInsert(List<VideoOrder> list);

}
