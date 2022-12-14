package com.mike.modbusmaster2kafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ModbusMaster2KafkaApplication

fun main(args: Array<String>) {
	runApplication<ModbusMaster2KafkaApplication>(*args)
}
