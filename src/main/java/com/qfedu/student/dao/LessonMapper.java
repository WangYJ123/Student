package com.qfedu.student.dao;

import com.qfedu.student.entity.Lesson;

public interface LessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lesson record);

    int insertSelective(Lesson record);

    Lesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);
}