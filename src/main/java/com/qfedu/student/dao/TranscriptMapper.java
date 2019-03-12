package com.qfedu.student.dao;

import com.qfedu.student.entity.Transcript;

public interface TranscriptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Transcript record);

    int insertSelective(Transcript record);

    Transcript selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Transcript record);

    int updateByPrimaryKey(Transcript record);
}