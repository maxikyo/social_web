package com.maxholovanov.springboot.api.social_web_restapi.data.repository

import com.maxholovanov.springboot.api.social_web_restapi.data.domain.UserReaction
import org.springframework.data.mongodb.repository.MongoRepository

interface UserReactionRepository extends MongoRepository<UserReaction, String> {

}