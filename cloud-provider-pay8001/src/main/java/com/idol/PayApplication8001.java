package com.idol;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/11/16 07:00
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient // 代表本类被服务注册中心发现
@EnableDiscoveryClient
public class PayApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication8001.class, args);
        log.info("============ 支付模块8001启动成功 ============");
    }
}
