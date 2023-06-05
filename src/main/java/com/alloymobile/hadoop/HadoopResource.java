package com.alloymobile.hadoop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HadoopResource {

    @GetMapping(value= "/hadoop")
    public String helloWorld(){
        return "Hello";
    }
}
