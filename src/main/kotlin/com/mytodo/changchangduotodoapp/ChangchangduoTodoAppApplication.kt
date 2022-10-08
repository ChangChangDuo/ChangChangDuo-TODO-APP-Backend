package com.mytodo.changchangduotodoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class ChangchangduoTodoAppApplication

fun main(args: Array<String>) {
    runApplication<ChangchangduoTodoAppApplication>(*args)
}
