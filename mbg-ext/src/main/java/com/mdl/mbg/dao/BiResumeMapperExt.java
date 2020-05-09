package com.mdl.mbg.dao;

import com.mdl.mbg.mapper.BiResumeMapper;
import com.mdl.mbg.model.BiResumeEntity;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface BiResumeMapperExt extends BiResumeMapper {

    List<BiResumeEntity> findByName(String jobSeekerName);

}
