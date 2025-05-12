package com.apress.myretroapp.config

import com.apress.myretroapp.RetroAppApplication
import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@EnableConfigurationProperties(RetroProperties::class)
@Configuration
class RetroAppConfiguration {
    var log = LoggerFactory.getLogger(RetroAppApplication::class.java)

    @Bean
    fun init(retroProperties: RetroProperties): ApplicationListener<ApplicationReadyEvent> =
        ApplicationListener { event: ApplicationReadyEvent? ->
            log.info(
                "\nThe users service properties are:\n" +
                    "- Server: {}\n- Port: {}\n- Username: {}\n- Password: {}",
                retroProperties.users.server,
                retroProperties.users.port,
                retroProperties.users.username,
                retroProperties.users.password,
            )
        }
}
