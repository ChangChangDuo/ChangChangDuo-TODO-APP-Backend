package com.mytodo.changchangduotodoapp.web

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): ResponseEntity<MutableMap<String, String>> {
         val helloResponse: MutableMap<String, String> = mutableMapOf("status" to "200", "message" to "Hello, World!")
        return ResponseEntity.ok(helloResponse)
    }
}