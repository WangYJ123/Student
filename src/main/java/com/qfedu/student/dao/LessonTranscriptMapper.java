package com.qfedu.student.dao;

import com.qfedu.student.entity.LessonTranscript;

public interface LessonTranscriptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LessonTranscript record);

    int insertSelective(LessonTranscript record);

    LessonTranscript selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LessonTranscript record);

    int updateByPrimaryKey(LessonTranscript record);
}