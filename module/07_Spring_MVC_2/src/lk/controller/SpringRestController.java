package lk.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/customer")
public class SpringRestController {

    @GetMapping
    public String getMethod(){
        return "Get Spring Rest Controller";
    }

    @PostMapping
    public String postMethod(){
        return "Post Spring Rest Controller";
    }

    @PutMapping
    public String putMethod(){
        return "Put Spring Rest Controller";
    }

    @DeleteMapping
    public String deleteMethod(){
        return "Delete Spring Rest Controller";
    }
}
