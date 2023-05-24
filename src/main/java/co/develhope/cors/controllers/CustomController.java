package co.develhope.cors.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("custom")
@CrossOrigin("http://localhost:8080")
public class CustomController {

    @GetMapping("")
    public String welcome(){
        return "Welcome!";

    }
}