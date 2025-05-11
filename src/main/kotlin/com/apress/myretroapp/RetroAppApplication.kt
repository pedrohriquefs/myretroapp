package com.apress.myretroapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RetroAppApplication

fun main(args: Array<String>) {
	runApplication<RetroAppApplication>(*args)
}
