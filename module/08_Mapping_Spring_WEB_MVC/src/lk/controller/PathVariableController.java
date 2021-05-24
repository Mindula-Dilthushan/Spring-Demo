package lk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/map/")
public class PathVariableController {

    //Path Variables
    @GetMapping(path = "/get/{id}")
    public String get(@PathVariable String id){
        return id;
    }

    @GetMapping(path = "/set/{name}/{address}")
    public String set(@PathVariable String name, @PathVariable String address){
        return "Name :"+name +" "+" "+"Address :"+address;
    }
}
