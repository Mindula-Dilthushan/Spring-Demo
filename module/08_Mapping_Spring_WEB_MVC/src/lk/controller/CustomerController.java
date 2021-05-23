package lk.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cust")
public class CustomerController {

    @PostMapping
    public String saveCustomer() {
        return "Customer Save";
    }

    @DeleteMapping
    public String deleteCustomer() {
        return "Customer Delete";
    }

    @GetMapping
    public String searchCustomer() {
        return "Customer Search";
    }

    @GetMapping("getAll")
    public String getAllCustomer() {
        return "Get All Customer";
    }

    @PutMapping
    public String updateCustomer(){
        return "Customer Update";
    }
}
