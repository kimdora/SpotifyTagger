package com.kimdora.spotifytagger.controller

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SpotifyTaggerController {
    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "Index"
        return "hello world"
    }

}