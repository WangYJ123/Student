package com.qfedu.student.controller;

import com.qfedu.student.common.sysconst.SystemCon;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Student;
import com.qfedu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Admin
 * @Date 2019/3/12 17:11
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("login.do")
    public ResultVo login(String name,String password){
        ResultVo resultVo = studentService.login(name,password);

        return resultVo;
    }
    @PostMapping("register.do")
    public ResultVo register(Student student){
         return studentService.register(student);
    }
}
