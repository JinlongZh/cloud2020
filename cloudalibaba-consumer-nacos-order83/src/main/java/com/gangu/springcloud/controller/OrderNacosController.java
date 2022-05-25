package com.gangu.springcloud.controller;

import com.gangu.springcloud.service.OrderNacosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderNacosController {

    @Resource
    private OrderNacosService orderNacosService;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return orderNacosService.getPayment(id);
    }


}
