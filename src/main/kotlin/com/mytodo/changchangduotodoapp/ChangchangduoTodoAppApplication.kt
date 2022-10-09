package com.mytodo.changchangduotodoapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import javax.annotation.PostConstruct

@EnableJpaAuditing
@SpringBootApplication
class ChangchangduoTodoAppApplication {
    @Value("\${spring.datasource.password}")
    val pwd: String? = null

    @PostConstruct
    fun test() {
        println("=====================================")
        println("pwd >>> $pwd")
    }

}

fun main(args: Array<String>) {
    runApplication<ChangchangduoTodoAppApplication>(*args)
}
