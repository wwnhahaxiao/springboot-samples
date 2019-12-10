package com.roshan.api;

import com.roshan.dao.ZysSupplierUserMapper;
import com.roshan.model.ZysSupplierUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    private final Logger logger = LoggerFactory.getLogger(TestApi.class);

    @Autowired
    private ZysSupplierUserMapper zysSupplierUserMapper;

    @GetMapping("/getById")
    public ZysSupplierUser getById(@RequestParam String id) {
        return zysSupplierUserMapper.getById(id);
    }

}
