package com.maxholovanov.springboot.api.social_web_restapi.controller

import com.maxholovanov.springboot.api.social_web_restapi.data.domain.User
import com.maxholovanov.springboot.api.social_web_restapi.model.dto.userInfo.UserDto
import com.maxholovanov.springboot.api.social_web_restapi.service.UserService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

@Slf4j
@Controller
class UserController {

    @Autowired
    private UserService userService

    @GetMapping("/api/users")
    Page<User> getAllUsers(@RequestParam(required = false, defaultValue = "0") int page
                              , @RequestParam(required = false, defaultValue = "10") int size) {
        userService.showAllUsers(page, size)
    }
}
