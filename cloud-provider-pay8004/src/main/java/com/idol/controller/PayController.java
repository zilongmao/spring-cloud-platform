package com.idol.controller;

import com.idol.beans.CommonResult;
import com.idol.beans.Pay;
import com.idol.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/15 15:14
 */
@Slf4j
@RequestMapping("/pay")
@RestController
public class PayController {

//    @Resource
//    private PayService payService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/zk")
    private String payZk() {
        return "spring cloud with zookeeper : " + serverPort + "\t" +UUID.randomUUID().toString();
    }

}
