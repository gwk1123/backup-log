package com.backup.log.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booking_info")//对应表名
@Data
public class BaseContent {

    private Long id;

    private String content;

    private String createTime;
}
