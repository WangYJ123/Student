package com.qfedu.student.service;

import com.qfedu.student.common.vo.ResultVo;
import com.qfedu.student.entity.Pay;

/**
 * @Author lxt
 * @Date 2019/3/14 15:35
 */
public interface PayService {

    //增加缴费记录
    ResultVo addPay(Pay pay);

    //删除缴费记录
    ResultVo deletePay(int id);

    //展示所有记录
    ResultVo queryAll();
}
