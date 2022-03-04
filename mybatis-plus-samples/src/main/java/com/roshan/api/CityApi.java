package com.roshan.api;

import com.roshan.model.City;
import com.roshan.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CityApi {
    @Resource
    private CityService cityService;

    @RequestMapping("/getById")
    public City getById(Integer id) {
        return cityService.getById(id);
    }
}
