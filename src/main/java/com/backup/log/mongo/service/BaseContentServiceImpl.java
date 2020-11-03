package com.backup.log.mongo.service;

import com.backup.log.mongo.entity.BaseContent;
import com.backup.log.mongo.repository.BaseContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseContentServiceImpl implements BaseContentService{

    @Autowired
    private BaseContentRepository baseContentRepository;

    public void save(String content){
        BaseContent baseContent =new BaseContent();
        baseContent.setContent(content);
        baseContentRepository.save(baseContent);
    }

}
