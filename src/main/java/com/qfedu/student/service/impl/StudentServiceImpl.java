package com.qfedu.student.service.impl;

import com.qfedu.student.common.util.ResultUtil;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.dao.StudentMapper;
import com.qfedu.student.entity.Student;
import com.qfedu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Admin
 * @Date 2019/3/11 21:47
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    Student student = null;
    @Override
    public ResultVo login(String name, String password) {

         student = studentMapper.selectByName(name);
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

         student = studentMapper.selectByName(student.getName());
         if (student != null){
             return ResultUtil.exec(false,"用户名已存在",null);
         }
        try {
            studentMapper.register(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResultUtil.exec(true,"Ok",null);
    }


}
