package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
      @GetMapping("/{name}")
      public String getName(@PathVariable("name")String name){
          return name;
      }
      @PostMapping("/reverse")
    public String reverseName(@RequestParam String name){
          return new StringBuilder(name).reverse().toString();
      }
}
