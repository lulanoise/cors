package co.develhope.cors.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("custom")
@CrossOrigin("http://localhost:5000")
public class CustomController {

    @GetMapping("")
    public String welcome(){
        return "Welcome!";

    }
}