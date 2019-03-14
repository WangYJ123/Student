package com.qfedu.student.controller;

import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Transcript;
import com.qfedu.student.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lxt
 * @Date 2019/3/14 17:26
 */
@RestController
public class TranscriptController {

    @Autowired
    private TranscriptService transcriptService;

    @RequestMapping("addTranscript.do")
    public ResultVo addLesson(Transcript transcript){
        return transcriptService.addTranscript(transcript);
    }

    @RequestMapping("deleteTranscript.do")
    public ResultVo deleteLesson(int id){
        return transcriptService.deleteTranscript(id);
    }

    @RequestMapping("listTranscript.do")
    public ResultVo listLesson(){
        return transcriptService.queryAll();
    }
}
