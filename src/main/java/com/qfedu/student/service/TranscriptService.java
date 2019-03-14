package com.qfedu.student.service;

import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Transcript;

/**
 * @Author lxt
 * @Date 2019/3/14 17:16
 */
public interface TranscriptService {

    //添加成绩单
    ResultVo addTranscript(Transcript transcript);

    //删除成绩单
    ResultVo deleteTranscript(int id);

    //展示所有成绩单
    ResultVo queryAll();
}
