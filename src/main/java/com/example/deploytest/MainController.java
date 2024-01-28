package com.example.deploytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/")
  public String showHello(){
    return "hello";
  }
}
