package com.maxholovanov.springboot.api.social_web_restapi.model.dto.userInfo

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.apache.groovy.parser.antlr4.GroovyLexer

class UserDto {

    String id

    @NotNull
    @NotEmpty(message = "name cannot be empty")
    String name

    @NotNull
    @NotEmpty(message = "surname cannot be empty")
    String surname

    @NotNull
    @NotEmpty(message = "password cannot be empty")
    String password

    @NotNull
    @NotEmpty(message = "role cannot be empty")
    String role
}
