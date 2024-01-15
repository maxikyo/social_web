package com.maxholovanov.springboot.api.social_web_restapi.security

import com.maxholovanov.springboot.api.social_web_restapi.data.domain.User
import com.maxholovanov.springboot.api.social_web_restapi.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserService userService

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByName(username)
        if (user == null){
            throw new UsernameNotFoundException("User not found")
        }
        return new org.springframework.security.core.userdetails.User(
                user.name,
                user.password,
                [new SimpleGrantedAuthority(user.role)]
        )
    }
}
