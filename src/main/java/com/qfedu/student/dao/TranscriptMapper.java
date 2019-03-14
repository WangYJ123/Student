package com.qfedu.student.dao;

import com.qfedu.student.entity.Transcript;

import java.util.List;

public interface TranscriptMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Transcript record);

    int insertSelective(Transcript record);

    Transcript selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Transcript record);

    int updateByPrimaryKey(Transcript record);

    //根据名称查询成绩单是否存在
    Transcript selectByName(String name);

    //展示所有成绩单
    List<Transcript> selectAll();

    //根据id查询成绩单是否存在
    Transcript selectById(int id);
}