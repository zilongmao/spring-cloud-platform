package com.idol.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/15 16:31
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
