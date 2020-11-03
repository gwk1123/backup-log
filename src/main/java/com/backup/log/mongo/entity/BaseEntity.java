package com.backup.log.mongo.entity;

import lombok.Data;

@Data
public class BaseEntity {

    private Long id;

    private String createName;

    private String createTime;

    private String updateName;

    private String updateTime;
}
