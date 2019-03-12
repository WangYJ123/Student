package com.qfedu.student.dao;

import com.qfedu.student.entity.StudentDocument;

public interface StudentDocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentDocument record);

    int insertSelective(StudentDocument record);

    StudentDocument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentDocument record);

    int updateByPrimaryKey(StudentDocument record);
}