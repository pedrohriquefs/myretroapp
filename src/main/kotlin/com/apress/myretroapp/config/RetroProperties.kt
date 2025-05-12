package com.apress.myretroapp.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "service")
class RetroProperties(
    var users: Users,
)

class Users {
    var server: String? = null
    var port: Int? = null
    var username: String? = null
    var password: String? = null
}
