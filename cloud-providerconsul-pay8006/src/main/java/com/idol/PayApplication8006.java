package com.idol;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO:
 *
 * @Created by 湖南爱豆
 * @Date 2021/3/11 19 19
 * @Author: 邻座旅客
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient // 该注解用于向使用consul或zookeeper作为注册中心时注册服务
public class PayApplication8006 {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication8006.class, args);
        log.info("============ 支付模块8006 consul 启动成功 ============");
    }
}
