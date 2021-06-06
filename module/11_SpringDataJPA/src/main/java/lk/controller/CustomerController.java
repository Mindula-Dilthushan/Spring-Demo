package lk.controller;

import lk.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public String getCustomer(){
        return "Get Customer Module 11";
    }

    @GetMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        return "Save Customer";
    }
}