package com.gangu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.gangu.springcloud.dao")
@Configuration
public class MybatisConfig {
}
