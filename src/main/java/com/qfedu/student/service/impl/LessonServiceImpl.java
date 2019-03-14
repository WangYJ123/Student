package com.qfedu.student.service.impl;

import com.qfedu.student.common.util.ResultUtil;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.dao.LessonMapper;
import com.qfedu.student.entity.Lesson;
import com.qfedu.student.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lxt
 * @Date 2019/3/14 11:42
 */
@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonMapper lessonMapper;

    @Override
    public ResultVo addLesson(Lesson lesson) {
        Lesson lesson1 = lessonMapper.selectByName(lesson.getName());
        if (lesson1 != null){
            return ResultUtil.exec(false, "学科已存在", null);
        }
        try {
            lessonMapper.insertSelective(lesson);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResultUtil.exec(true, "OK", null);
    }

    @Override
    public ResultVo deleteLesson(int id) {
        Lesson lesson = lessonMapper.selectById(id);
        if (lesson != null){
            return ResultUtil.exec(lessonMapper.deleteByPrimaryKey(id)>0, "OK", null);
        }else {
            return ResultUtil.exec(false, "学科不存在", null);
        }
    }

    @Override
    public ResultVo updateLesson(int id) {
        Lesson lesson = lessonMapper.selectById(id);
        if (lesson != null){
            return ResultUtil.exec(lessonMapper.updateById(id)>0, "OK", null);
        }
        return ResultUtil.exec(false, "学科不存在", null);
    }

    @Override
    public ResultVo queryAll() {
        List<Lesson> list = lessonMapper.selectAll();
        return ResultUtil.exec(true, "OK", list);
    }
}
