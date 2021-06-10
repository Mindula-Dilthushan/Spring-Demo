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
    private CustomerService service;


    @PostMapping
    public String saveCustomer(@RequestBody CustomerDTO dto) {
        boolean b = service.addCustomer(dto);
        return b + "";
    }


    @GetMapping
    public ArrayList<CustomerDTO> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping(path = "/{id}")
    public CustomerDTO searchCustomer(@PathVariable String id) {
        return service.searchCustomer(id);
    }

    @DeleteMapping(params = {"id"})
    public String deleteCustomer(@RequestParam String id) {
        boolean b = service.deleteCustomer(id);
        return b + "";
    }

    @PutMapping
    public String updateCustomer(@RequestBody CustomerDTO dto) {
        boolean b = service.updateCustomer(dto);
        return b + "";
    }
}