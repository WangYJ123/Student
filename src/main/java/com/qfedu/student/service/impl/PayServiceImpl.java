package com.qfedu.student.service.impl;

import com.qfedu.student.common.util.ResultUtil;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.dao.PayMapper;
import com.qfedu.student.entity.Pay;
import com.qfedu.student.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lxt
 * @Date 2019/3/14 15:39
 */
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayMapper payMapper;

    @Override
    public ResultVo addPay(Pay pay) {
        Pay pay1 = payMapper.selectByName(pay.getName());
        if (pay1 != null){
            return ResultUtil.exec(false, "缴费记录已经存在", null);
        }
        try {
            payMapper.insertSelective(pay);
        }catch (Exception e){
            e.printStackTrace();

        }
        return ResultUtil.exec(true, "OK", null);
    }

    @Override
    public ResultVo deletePay(int id) {
        Pay pay = payMapper.selectByPrimaryKey(id);
        if (pay != null){
            return ResultUtil.exec(payMapper.deleteByPrimaryKey(id)>0, "OK",null);
        }else {
            return ResultUtil.exec(false,"缴费记录不存在", null);
        }
    }

    @Override
    public ResultVo queryAll() {
        List<Pay> list = payMapper.selectAll();
        return ResultUtil.exec(true,"OK",list);
    }
}
