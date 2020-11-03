package com.backup.log.mongo.controller;

import com.backup.log.mongo.service.BaseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/backup")
public class BaseContentController {

    @Autowired
    private BaseContentService baseContentService;

    @RequestMapping(value = "/booking_info")
    public void saveBookingInfo(String content){
        baseContentService.save(content);
    }


}
