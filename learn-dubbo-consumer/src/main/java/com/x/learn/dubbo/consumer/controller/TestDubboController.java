package com.x.learn.dubbo.consumer.controller;

import com.x.learn.dubbo.provider.api.ITestDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zjx
 * @Date: 2019/10/20 20:08
 * @Version 1.0
 */
@RestController
public class TestDubboController {

    @Reference(version = "1.0.0")
    private ITestDubboService testDubboService;


    @GetMapping("test/{str}")
    public String testDubbo(@PathVariable String str) {
        return testDubboService.testDubbo(str);
    }
}
