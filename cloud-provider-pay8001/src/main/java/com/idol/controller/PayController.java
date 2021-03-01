package com.idol.controller;

import com.idol.beans.CommonResult;
import com.idol.beans.Pay;
import com.idol.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @Resource
    private PayService payService;

    @PostMapping(value = "/insert")
    public CommonResult insert(@RequestBody Pay pay) {
        int insert = payService.insert(pay);
        log.info("-------- 插入结果:{} --------", insert);
        if (insert > 0) {
            log.info("牛逼啊哈哈");
            return new CommonResult(200, "插入数据库成功", insert);
        }
        log.info("哈哈哈");
        return new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "/findById/{id}")
    public CommonResult findById(@PathVariable("id") Long id) {
        Pay pay = payService.findById(id);
        log.info("-------- 查询结果:{} --------", pay);
        if (pay != null) {
            return new CommonResult(200, "查询成功", pay);
        }
        return new CommonResult(444, "查询失败,id:" + id, null);
    }
}
