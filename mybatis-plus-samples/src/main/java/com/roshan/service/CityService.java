package com.roshan.service;

import com.roshan.dao.CityMapper;
import com.roshan.model.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CityService {
    @Resource
    private CityMapper cityMapper;

    public City getById(Integer id) {
        return cityMapper.selectById(id);
    }
}
