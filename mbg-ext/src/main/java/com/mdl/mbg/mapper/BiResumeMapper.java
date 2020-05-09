package com.mdl.mbg.mapper;

import com.mdl.mbg.model.BiResume;

public interface BiResumeMapper {
    int deleteByPrimaryKey(String id);

    int insert(BiResume record);

    int insertSelective(BiResume record);

    BiResume selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BiResume record);

    int updateByPrimaryKeyWithBLOBs(BiResume record);

    int updateByPrimaryKey(BiResume record);
}