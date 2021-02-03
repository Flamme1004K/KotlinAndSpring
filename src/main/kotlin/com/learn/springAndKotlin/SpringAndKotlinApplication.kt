package com.learn.springAndKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringAndKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringAndKotlinApplication>(*args)
}
