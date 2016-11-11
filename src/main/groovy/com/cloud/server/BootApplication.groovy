package com.cloud.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

import static org.springframework.boot.SpringApplication.run

@EnableConfigServer
@SpringBootApplication
class BootApplication {

    static void main(String[] args) {
        run BootApplication, args
    }
}
