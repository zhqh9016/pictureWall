package com.taikang.jkx.mapper;

import com.taikang.jkx.model.Filergbs;
import com.taikang.jkx.model.FilergbsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FilergbsMapper {
    long countByExample(FilergbsExample example);

    int deleteByExample(FilergbsExample example);

    int deleteByPrimaryKey(String filename);

    int insert(Filergbs record);

    int insertSelective(Filergbs record);

    List<Filergbs> selectByExample(FilergbsExample example);

    Filergbs selectByPrimaryKey(String filename);

    int updateByExampleSelective(@Param("record") Filergbs record, @Param("example") FilergbsExample example);

    int updateByExample(@Param("record") Filergbs record, @Param("example") FilergbsExample example);

    int updateByPrimaryKeySelective(Filergbs record);

    int updateByPrimaryKey(Filergbs record);
}