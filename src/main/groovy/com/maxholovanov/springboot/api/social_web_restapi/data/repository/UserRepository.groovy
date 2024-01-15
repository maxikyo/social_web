package com.maxholovanov.springboot.api.social_web_restapi.data.repository

import com.maxholovanov.springboot.api.social_web_restapi.data.domain.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository


interface UserRepository extends MongoRepository <User, String>{
    Page<User> findAll(Pageable pageable)

    Optional<User> findByName(String name)

}