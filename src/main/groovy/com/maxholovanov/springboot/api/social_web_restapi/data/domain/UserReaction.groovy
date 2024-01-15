package com.maxholovanov.springboot.api.social_web_restapi.data.domain

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Version
import org.springframework.data.mongodb.core.mapping.Document

@Document("userReactions")
class UserReaction {

    @Id
    int id

    @Version
    Long version
}
