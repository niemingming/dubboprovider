package com.nmm.study.service.impl;

import com.nmm.study.service.DubboServiceProvider;
import org.springframework.stereotype.Component;

/**
 * @description 实现接口服务
 * @date 2017/12/7
 * @author Niemingming
 */
@Component("dubboServiceProvider")
public class DubboServiceProviderImpl implements DubboServiceProvider {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
