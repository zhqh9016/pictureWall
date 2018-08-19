package com.taikang.jkx.mapper;

import com.taikang.jkx.model.Destfile;
import com.taikang.jkx.model.DestfileExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DestfileMapper {
    long countByExample(DestfileExample example);

    int deleteByExample(DestfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Destfile record);

    int insertSelective(Destfile record);

    List<Destfile> selectByExample(DestfileExample example);

    Destfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Destfile record, @Param("example") DestfileExample example);

    int updateByExample(@Param("record") Destfile record, @Param("example") DestfileExample example);

    int updateByPrimaryKeySelective(Destfile record);

    int updateByPrimaryKey(Destfile record);
}