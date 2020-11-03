package com.roshan.api;

import com.roshan.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlController {

    @RequestMapping(value = "/receive", consumes = MediaType.APPLICATION_XML_VALUE)
    public void receive(@RequestBody User user) {
        System.out.println(user);
    }
}
