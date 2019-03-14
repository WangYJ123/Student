package com.qfedu.student.controller;

import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Student;
import com.qfedu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lxt
 * @Date 2019/3/12 17:11
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("login.do")
    public ResultVo login(String name,String password){
        ResultVo resultVo = studentService.login(name,password);
        return resultVo;
    }

    @RequestMapping("register.do")
    public ResultVo register(Student student){
        return studentService.register(student);
    }

    @RequestMapping("changePassword.do")
    public ResultVo changePassword(int uid, String password){
        return studentService.changePassword(uid,password);
    }

    @RequestMapping("list.do")
    public ResultVo queryAll(){
        return studentService.queryAll();
    }

    @RequestMapping("delete.do")
    public ResultVo delete(int id){
        return studentService.delete(id);
    }


}
