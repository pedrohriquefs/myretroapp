package com.apress.myretroapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyretroappApplication

fun main(args: Array<String>) {
	runApplication<MyretroappApplication>(*args)
}
