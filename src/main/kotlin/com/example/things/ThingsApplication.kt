package com.example.things

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThingsApplication

fun main(args: Array<String>) {
    runApplication<ThingsApplication>(*args)
}
