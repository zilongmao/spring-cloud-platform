package com.idol.service;

import com.idol.beans.Pay;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/15 15:12
 */
public interface PayService {
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
    Pay findById(Long id);
}
