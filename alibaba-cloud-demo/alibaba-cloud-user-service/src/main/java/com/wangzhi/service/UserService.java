package com.wangzhi.service;

import com.wangzhi.domain.User;
import java.util.List;
public interface UserService{


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();

    int batchInsert(List<User> list);

}
