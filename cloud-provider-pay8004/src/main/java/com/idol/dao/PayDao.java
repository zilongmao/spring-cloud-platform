package com.idol.dao;

import com.idol.beans.Pay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/15 14:59
 */
@Mapper
public interface PayDao {

    /**
     * 新增数据
     * @param pay
     * @return
     */
    int insert(Pay pay);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Pay findById(@Param("id") Long id);
}
