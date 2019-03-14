package com.qfedu.student.service;

import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Lesson;

/**
 * @Author lxt
 * @Date 2019/3/14 11:30
 */
public interface LessonService {

    //添加学科
    ResultVo addLesson(Lesson lesson);

    //删除学科
    ResultVo deleteLesson(int id);

    //修改学科
    ResultVo updateLesson(int id);

    //展示所有学科
    ResultVo queryAll();
}
