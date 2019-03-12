package com.qfedu.student.dao;

import com.qfedu.student.entity.StudentLesson;

public interface StudentLessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentLesson record);

    int insertSelective(StudentLesson record);

    StudentLesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentLesson record);

    int updateByPrimaryKey(StudentLesson record);
}