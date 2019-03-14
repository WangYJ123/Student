package com.qfedu.student.service.impl;

import com.qfedu.student.common.util.ResultUtil;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.dao.TranscriptMapper;
import com.qfedu.student.entity.Transcript;
import com.qfedu.student.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Admin
 * @Date 2019/3/14 17:18
 */
@Service
public class TranscriptServiceImpl implements TranscriptService {

    @Autowired
    private TranscriptMapper transcriptMapper;

    @Override
    public ResultVo addTranscript(Transcript transcript) {
        Transcript transcript1 = transcriptMapper.selectByName(transcript.getName());
        if (transcript1 != null){
            return ResultUtil.exec(false, "成绩单已存在", null);
        }
        try {
            transcriptMapper.insertSelective(transcript);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResultUtil.exec(true, "OK", null);
    }

    @Override
    public ResultVo deleteTranscript(int id) {
        Transcript transcript = transcriptMapper.selectById(id);
        if (transcript != null){
            return ResultUtil.exec(transcriptMapper.deleteByPrimaryKey(id)>0, "OK", null);
        }else {
            return ResultUtil.exec(false, "成绩单不存在", null);
        }
    }

    @Override
    public ResultVo queryAll() {
        List<Transcript> list = transcriptMapper.selectAll();
        return ResultUtil.exec(true, "OK", list);
    }
}