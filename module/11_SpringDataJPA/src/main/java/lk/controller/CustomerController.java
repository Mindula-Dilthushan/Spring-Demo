package lk.controller;

import lk.dto.CustomerDTO;
import lk.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getCustomer(){
        return "Get Customer Module 11";
    }

    @PostMapping
    public String saveCustomer(CustomerDTO dto) {
        boolean b = customerService.addCustomer(dto);
        return "";
    }

    @GetMapping
    public ArrayList<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping(path = "/{id}")
    public CustomerDTO searchCustomer(@PathVariable String id) {
        return customerService.searchCustomer(id);
    }


    @DeleteMapping(params = {"id"})
    public String deleteCustomer(@RequestParam String id) {
        boolean b = customerService.deleteCustomer(id);
        return b + "";
    }

    @PutMapping
    public String updateCustomer(@RequestBody CustomerDTO dto) {
        boolean b = customerService.updateCustomer(dto);
        return b + "";
    }
}