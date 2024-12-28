package io.cheonkyu.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class AppController {
    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }
}