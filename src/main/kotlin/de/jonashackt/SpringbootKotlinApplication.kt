package de.jonashackt

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringbootKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootKotlinApplication::class.java, *args)
}
