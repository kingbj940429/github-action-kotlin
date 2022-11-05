package io.github.githubactionkotlin.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
    @Value("\${secrets.first}")
    val name: String
) {

    @GetMapping("/")
    fun test(): String {
        return name
    }

}