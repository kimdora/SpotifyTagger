package com.kimdora.spotifytagger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpotifyTaggerApplication

fun main(args: Array<String>) {
    runApplication<SpotifyTaggerApplication>(*args)
}
