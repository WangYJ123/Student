package com.qfedu.student.dao;

import com.qfedu.student.entity.Lesson;

import java.util.List;

public interface LessonMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Lesson record);

    int insertSelective(Lesson lesson);

    Lesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);

    //查询学科名是否存在
    Lesson selectByName(String name);

    //查询学科id是否存在
    Lesson selectById(int id);

    //根据学科id修改信息
    int updateById(int id);

    //展示所有学科
    List<Lesson> selectAll();
}