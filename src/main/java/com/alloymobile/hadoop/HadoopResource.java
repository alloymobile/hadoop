package com.alloymobile.hadoop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HadoopResource {

    @GetMapping(value= "/hadoop")
    public String helloWorld(@RequestParam String name){


        return "Hello "+name;

    }

}
