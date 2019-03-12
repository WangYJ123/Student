package com.qfedu.student.dao;

import java.util.List;
import java.util.Map;

/**
 * @Author Admin
 * @Date 2019/3/11 22:29
 */
public interface BaseDao<T> {
    Long selectCount();
    List<T> selectPage(Map<String,Object> map);
    int insert(T t);
}
