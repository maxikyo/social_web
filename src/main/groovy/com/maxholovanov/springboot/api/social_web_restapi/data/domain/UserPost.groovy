package com.maxholovanov.springboot.api.social_web_restapi.data.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Version
import org.springframework.data.mongodb.core.mapping.Document

@Document("userPosts")
class UserPost {

    @Id
    int id

    @CreatedDate
    Date date

    String content

    String userId

    boolean isPublic

    @Version
    Long version

}
