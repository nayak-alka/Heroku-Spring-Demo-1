package com.example.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hi")
    public String sayHello() {
        return "1st API";
    }

    @GetMapping("/convert")
    public int convertToINR(@RequestParam int q) {
        return q * 74;
    }

    @GetMapping("/convert/{USD}")
    public int convertToINR2(@PathVariable("USD") int q) {
        return q * 74;
    }

}
