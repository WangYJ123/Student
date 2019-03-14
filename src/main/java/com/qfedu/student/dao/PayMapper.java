package com.qfedu.student.dao;

import com.qfedu.student.entity.Pay;

import java.util.List;

public interface PayMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Pay record);

    int insertSelective(Pay record);

    Pay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);

    //查询缴费记录是否存在
    Pay selectByName(String name);

    //展示所有记录
    List<Pay> selectAll();
}