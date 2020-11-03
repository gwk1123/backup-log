package com.backup.log.mongo.repository;

import com.backup.log.mongo.entity.BaseContent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BaseContentRepository extends MongoRepository<BaseContent, String> {
}
