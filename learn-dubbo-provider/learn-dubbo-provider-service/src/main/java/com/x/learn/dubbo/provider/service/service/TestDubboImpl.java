package com.x.learn.dubbo.provider.service.service;

import com.x.learn.dubbo.provider.api.ITestDubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Auther: zjx
 * @Date: 2019/10/20 19:56
 * @Version 1.0
 */
@Service(version = "1.0.0")
public class TestDubboImpl implements ITestDubboService {
    @Override
    public String testDubbo(String str) {
        return "dubbo:" + str;
    }
}
