package com.maxholovanov.springboot.api.social_web_restapi.service

import com.maxholovanov.springboot.api.social_web_restapi.data.domain.User
import com.maxholovanov.springboot.api.social_web_restapi.data.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

import java.security.Principal

@Service
class UserService {
    @Autowired
    private UserRepository userRepository

    @Autowired
    private PasswordEncoder passwordEncoder

    Page<User> showAllUsers(int page, int size){
        userRepository.findAll(PageRequest.of(page, size))
    }

    User saveUser(User user){
        userRepository.save(user)
    }

    User getUserById(String id){
        userRepository.findById(id).orElse(null)
    }

    void deleteUserById(String id){
        userRepository.deleteById(id)
    }

    User findByName(String name){
        userRepository.findByName(name).orElse(null)
    }

    User findByPrincipal(Principal principal){
        if (!principal){
            return null
        }else{
            return findByName(principal.getName())
        }
    }

    User registerNewUser(User user) {  // // - возвращал null
        if(Objects.isNull(user.name)){
            throw new RuntimeException("Неправильное имя")
        }
        if(Objects.isNull(user.password)){
            throw new RuntimeException("Неправильный пароль")
        }

        if (!Objects.isNull(findByName(user.name))) {
            throw new RuntimeException("Пользователь с таким именем уже существует")
        }
        String encodedPassword = passwordEncoder.encode(user.getPassword())
        user.setPassword(encodedPassword)
        saveUser(user)
    }
}
