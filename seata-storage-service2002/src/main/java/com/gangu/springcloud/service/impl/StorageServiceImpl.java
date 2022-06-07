package com.gangu.springcloud.service.impl;

import com.gangu.springcloud.dao.StorageDao;
import com.gangu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("库存扣减开始----");
        storageDao.decrease(productId, count);
        log.info("库存扣减结束----");
    }
}
