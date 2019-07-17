package com.zhoujh.dao;

import com.zhoujh.pojo.pojo.InstitutionMark;
import com.zhoujh.pojo.pojo.InstitutionMarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstitutionMarkMapper {
    int countByExample(InstitutionMarkExample example);

    int deleteByExample(InstitutionMarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InstitutionMark record);

    int insertSelective(InstitutionMark record);

    List<InstitutionMark> selectByExample(InstitutionMarkExample example);

    InstitutionMark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InstitutionMark record, @Param("example") InstitutionMarkExample example);

    int updateByExample(@Param("record") InstitutionMark record, @Param("example") InstitutionMarkExample example);

    int updateByPrimaryKeySelective(InstitutionMark record);

    int updateByPrimaryKey(InstitutionMark record);
}