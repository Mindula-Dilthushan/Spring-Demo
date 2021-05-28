package lk.controller;

import lk.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("äpi/v1/json")
public class JSONController {

    @PostMapping
    public String saveCustomers(@RequestBody CustomerDTO customerDTO){
        return customerDTO.toString();
    }

    @GetMapping
    public CustomerDTO getAllCustomers(){
        return new CustomerDTO("C001","Mindula","Matara","50000");
    }
}
