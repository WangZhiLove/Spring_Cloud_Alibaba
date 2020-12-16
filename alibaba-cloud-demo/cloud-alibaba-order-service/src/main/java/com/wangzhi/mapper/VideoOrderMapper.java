package com.wangzhi.mapper;

import com.wangzhi.domain.VideoOrder;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VideoOrderMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(VideoOrder record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(VideoOrder record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    VideoOrder selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(VideoOrder record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(VideoOrder record);

    int batchInsert(@Param("list") List<VideoOrder> list);
}