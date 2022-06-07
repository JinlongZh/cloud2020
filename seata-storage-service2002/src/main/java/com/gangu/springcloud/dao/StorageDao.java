package com.gangu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}

