package com.zhoujh.dao;

import com.zhoujh.pojo.pojo.InstitutionSalesDep;
import com.zhoujh.pojo.pojo.InstitutionSalesDepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstitutionSalesDepMapper {
    int countByExample(InstitutionSalesDepExample example);

    int deleteByExample(InstitutionSalesDepExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InstitutionSalesDep record);

    int insertSelective(InstitutionSalesDep record);

    List<InstitutionSalesDep> selectByExample(InstitutionSalesDepExample example);

    InstitutionSalesDep selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InstitutionSalesDep record, @Param("example") InstitutionSalesDepExample example);

    int updateByExample(@Param("record") InstitutionSalesDep record, @Param("example") InstitutionSalesDepExample example);

    int updateByPrimaryKeySelective(InstitutionSalesDep record);

    int updateByPrimaryKey(InstitutionSalesDep record);
}