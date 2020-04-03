package com.shaman.buildmicroservicedocker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BuildMicroServiceDockerApplication

fun main(args: Array<String>) {
	runApplication<BuildMicroServiceDockerApplication>(*args)
}
