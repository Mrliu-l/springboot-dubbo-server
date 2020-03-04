package com.self.springboot.dubbo.service;

import com.self.springboot.dubbo.IPayInterface;
import org.apache.dubbo.config.annotation.Service;


@Service
public class PayService implements IPayInterface {
    @Override
    public String pay(String message) {
        System.out.println("调用成功，入参为：" + message);
        return "调用成功";
    }
}
