package com.qfedu.student.dao;

import com.qfedu.student.entity.Student;

public interface StudentMapper extends BaseDao<Student>{
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    //根据用户名查询用户是否存在
    Student selectByName(String name);

    //注册
    void register(Student student);
}