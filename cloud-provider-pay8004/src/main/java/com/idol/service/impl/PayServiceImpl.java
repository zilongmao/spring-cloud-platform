package com.idol.service.impl;

import com.idol.beans.Pay;
import com.idol.dao.PayDao;
import com.idol.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/15 15:13
 */
@Service
public class PayServiceImpl implements PayService {

    @Resource
    private PayDao payDao;

    @Override
    public int insert(Pay pay) {
        return payDao.insert(pay);
    }

    @Override
    public Pay findById(Long id) {
        return payDao.findById(id);
    }
}
