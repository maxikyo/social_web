package com.maxholovanov.springboot.api.social_web_restapi.data.domain

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Version
import org.springframework.data.mongodb.core.mapping.Document

@Document("users")
class User {

    @Id
    String id

    String name

    String surname

    String password

    String role

    @Version
    Long version

}
