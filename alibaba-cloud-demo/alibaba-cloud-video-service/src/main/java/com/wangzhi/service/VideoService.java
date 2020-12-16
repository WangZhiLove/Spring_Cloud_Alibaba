package com.wangzhi.service;

import java.util.List;
import com.wangzhi.domain.Video;
import org.apache.ibatis.annotations.Mapper;

public interface VideoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

    int batchInsert(List<Video> list);

}
