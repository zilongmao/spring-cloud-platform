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
import java.util.UUID;

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

//    static final String INVOKE_URL = "http://CLOUD-PAY-SERVICE";
    static final String INVOKE_URL = "http://cloud-pay-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/pay/insert")
    public CommonResult<Pay> insert(Pay pay) {
        return restTemplate.postForObject(INVOKE_URL + "/pay/insert", pay, CommonResult.class);
    }

    @GetMapping("/pay/findById/{id}")
    public CommonResult<Pay> getPay(@PathVariable("id") Long id) {
        return restTemplate.getForObject(INVOKE_URL + "/pay/findById/" + id, CommonResult.class);
    }

    @GetMapping("/zk")
    private String payZk() {
//        return "spring cloud with zookeeper : " + serverPort + "\t" +UUID.randomUUID().toString();
        String result = restTemplate.getForObject(INVOKE_URL + "/pay/zk", String.class);
        return result;
    }
}
