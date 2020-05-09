package com.mdl.mbg.generator.mapper;

import com.mdl.mbg.generator.model.BiResume;
import com.mdl.mbg.generator.model.BiResumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiResumeMapper {
    long countByExample(BiResumeExample example);

    int deleteByExample(BiResumeExample example);

    int deleteByPrimaryKey(String id);

    int insert(BiResume record);

    int insertSelective(BiResume record);

    List<BiResume> selectByExampleWithBLOBs(BiResumeExample example);

    List<BiResume> selectByExample(BiResumeExample example);

    BiResume selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BiResume record, @Param("example") BiResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") BiResume record, @Param("example") BiResumeExample example);

    int updateByExample(@Param("record") BiResume record, @Param("example") BiResumeExample example);

    int updateByPrimaryKeySelective(BiResume record);

    int updateByPrimaryKeyWithBLOBs(BiResume record);

    int updateByPrimaryKey(BiResume record);
}