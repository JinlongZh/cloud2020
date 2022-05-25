package com.gangu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "nacos-payment-provider")
public interface OrderNacosService {

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id);

}
