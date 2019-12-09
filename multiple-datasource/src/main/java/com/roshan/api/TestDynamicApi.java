package com.roshan.api;

import com.roshan.dao.dynamicTest1.UserMapper;
import com.roshan.dao.dynamicTest2.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDynamicApi {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CityMapper cityMapper;

    @GetMapping("/getName")
    public String getUser(Integer id) {
        return userMapper.getById(id).getName();
    }

    @GetMapping("/getCity")
    public String getCity(Integer id) {
        return cityMapper.getById(id).getName();
    }
}
