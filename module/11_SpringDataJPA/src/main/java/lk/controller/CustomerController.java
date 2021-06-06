package lk.controller;

import lk.dto.CustomerDTO;
import lk.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    @GetMapping
//    public String getCustomer(){
//        return "Get Customer Module 11";
//    }

    @PostMapping()
    public String saveCustomer(CustomerDTO customerDTO){
        boolean save = customerService.addCustomer(customerDTO);
        return save + " ";
    }
}