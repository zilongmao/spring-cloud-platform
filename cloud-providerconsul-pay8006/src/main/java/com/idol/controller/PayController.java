package com.idol.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * TODO:
 *
 * @Created by 湖南爱豆
 * @Date 2021/3/11 19 20
 * @Author: 邻座旅客
 */
@Slf4j
@RequestMapping("/pay")
@RestController
public class PayController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consul")
    private String payConsul() {
        log.info("payZk被调用...");
        return "spring cloud with consul : " + serverPort + "\t" +UUID.randomUUID().toString();
    }
}
