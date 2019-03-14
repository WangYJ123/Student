package com.qfedu.student.dao;

import com.qfedu.student.common.vo.PageVo;
import com.qfedu.student.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper{

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student student);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    //根据用户名查询用户是否存在
    Student selectByName(String name);

    //注册新用户
    //void register(Student student);

    //找回密码
    int updateByIdPassword(@Param("id") int id, @Param("password") String password);

    //展示所有用户
    List<Student> selectAll();

}