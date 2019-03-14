package com.qfedu.student.controller;

import com.qfedu.student.common.util.ResultUtil;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Lesson;
import com.qfedu.student.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lxt
 * @Date 2019/3/14 11:48
 */
@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @RequestMapping("addLesson.do")
    public ResultVo addLesson(Lesson lesson){
        return lessonService.addLesson(lesson);
    }

    @RequestMapping("deleteLesson.do")
    public ResultVo deleteLesson(int id){
        return lessonService.deleteLesson(id);
    }

    @RequestMapping("updateLesson,do")
    public ResultVo updateLesson(int id){
        return lessonService.updateLesson(id);
    }

    @RequestMapping("listLesson.do")
    public ResultVo listLesson(){ return lessonService.queryAll(); }
}
