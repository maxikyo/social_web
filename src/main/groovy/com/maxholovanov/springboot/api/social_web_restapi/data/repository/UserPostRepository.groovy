package com.maxholovanov.springboot.api.social_web_restapi.data.repository

import com.maxholovanov.springboot.api.social_web_restapi.data.domain.UserPost
import org.springframework.data.mongodb.repository.MongoRepository

interface UserPostRepository extends MongoRepository<UserPost, String>{

}