package io.munkush.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaudeHelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

}