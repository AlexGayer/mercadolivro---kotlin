package com.mercadolivro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class MercadolivroApplication

fun main(args: Array<String>) {
	runApplication<MercadolivroApplication>(*args)
}
