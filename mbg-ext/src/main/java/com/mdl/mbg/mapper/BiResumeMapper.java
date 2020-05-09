package com.mdl.mbg.mapper;

import com.mdl.mbg.model.BiResumeEntity;

public interface BiResumeMapper {
    int deleteByPrimaryKey(String id);

    int insert(BiResumeEntity record);

    int insertSelective(BiResumeEntity record);

    BiResumeEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BiResumeEntity record);

    int updateByPrimaryKeyWithBLOBs(BiResumeEntity record);

    int updateByPrimaryKey(BiResumeEntity record);
}