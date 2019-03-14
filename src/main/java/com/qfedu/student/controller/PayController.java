package com.qfedu.student.controller;

import com.qfedu.student.common.util.ResultUtil;
import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.dao.PayMapper;
import com.qfedu.student.entity.Pay;
import com.qfedu.student.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lxt
 * @Date 2019/3/14 15:49
 */
@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @RequestMapping("addPay.do")
    public ResultVo addPay(Pay pay){
        return payService.addPay(pay);
    }

    @RequestMapping("deletePay.do")
    public ResultVo delete(int id){
        return payService.deletePay(id);
    }

    @RequestMapping("listPay.do")
    public ResultVo listPay(){
        return payService.queryAll();
    }
}
