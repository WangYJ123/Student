package com.qfedu.student.service;

import com.qfedu.student.common.vo.PageVo;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Student;

/**
 * @Author lxt
 * @Date 2019/3/11 21:46
 */
public interface StudentService {

    //登录
    ResultVo login(String name, String password);

    //注册
    ResultVo register(Student student);

    //找回密码
    ResultVo changePassword(int uid, String password);

    //删除
    ResultVo delete(int id);

    //展示所有
    ResultVo queryAll();
}
