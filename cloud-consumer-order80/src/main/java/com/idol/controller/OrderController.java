package com.idol.controller;

import com.idol.beans.CommonResult;
import com.idol.beans.Pay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/15 15:56
 */
@Slf4j
@RequestMapping("/consumer")
@RestController
public class OrderController {

    static final String PAY_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/pay/insert")
    public CommonResult<Pay> insert(Pay pay) {
        return restTemplate.postForObject(PAY_URL + "/pay/insert", pay, CommonResult.class);
    }

    @GetMapping("/pay/findById/{id}")
    public CommonResult<Pay> getPay(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAY_URL + "/pay/findById/" + id, CommonResult.class);
    }
}
