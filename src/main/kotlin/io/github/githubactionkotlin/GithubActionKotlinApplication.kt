package io.github.githubactionkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubActionKotlinApplication

fun main(args: Array<String>) {
    runApplication<GithubActionKotlinApplication>(*args)
}
