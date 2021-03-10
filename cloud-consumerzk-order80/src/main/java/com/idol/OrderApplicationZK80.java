package com.idol;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/15 15:53
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient // 代表本类被服务注册中心发现
public class OrderApplicationZK80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationZK80.class, args);
        log.info("============ 消费者订单模块80 zk 启动成功 ============");
    }
}
