package com.qfedu.student.service.impl;

import com.qfedu.student.common.util.ResultUtil;
import com.qfedu.student.common.vo.PageVo;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.dao.StudentMapper;
import com.qfedu.student.entity.Student;
import com.qfedu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author lxt
 * @Date 2019/3/11 21:47
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public ResultVo login(String name, String password) {
        Student student = studentMapper.selectByName(name);
        if(student != null){
            if (student.getPassword().equals(password)){
                //登陆成功
                return ResultUtil.exec(true,"Ok",student);
            }
        }
        //登录失败
        return ResultUtil.exec(false,"用户名或密码不正确",null);
    }

    @Override
    public ResultVo register(Student student) {

         Student student1 = studentMapper.selectByName(student.getName());
         if (student1 != null){
             return ResultUtil.exec(false,"用户名已存在",null);
         }
        try {
            studentMapper.insertSelective(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultUtil.exec(true,"Ok",null);
    }

    @Override
    public ResultVo changePassword(int uid, String password) {
        return ResultUtil.exec(studentMapper.updateByIdPassword(uid, password)>0, "OK", null);
    }

    @Override
    public ResultVo queryAll() {
        List<Student> list = studentMapper.selectAll();
        return ResultUtil.exec(true, "OK", list);
    }

    @Override
    public ResultVo delete(int id) {
        return ResultUtil.exec(studentMapper.deleteByPrimaryKey(id)>0, "OK", null);
    }
}
