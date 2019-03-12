package com.qfedu.student.service;

import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Student;

/**
 * @Author Admin
 * @Date 2019/3/11 21:46
 */
public interface StudentService {

    //登录
    ResultVo login(String name, String password);

    //注册
    ResultVo register(Student student);

}
