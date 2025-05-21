package br.com.helloworld.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }
}
