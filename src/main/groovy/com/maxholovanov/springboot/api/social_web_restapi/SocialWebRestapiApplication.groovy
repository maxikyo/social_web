package com.maxholovanov.springboot.api.social_web_restapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity

@EnableMongoAuditing()
@EnableMethodSecurity(prePostEnabled = true)
@SpringBootApplication(scanBasePackages = "com.maxholovanov.springboot.api.social_web_restapi")
class SocialWebRestapiApplication {

	static void main(String[] args) {
		SpringApplication.run(SocialWebRestapiApplication, args)
	}

}
