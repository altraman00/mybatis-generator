package com.demo.dao;

import com.demo.model.UserDo;

public interface UserDoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}