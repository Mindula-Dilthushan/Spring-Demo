package lk.controller;

import lk.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public String getCustomer(){
        return "Get Customer";
    }

    @PostMapping
    public String saveCustomer(CustomerDTO customerDTO){
        return customerDTO.toString();
    }

    @GetMapping(path = "/search")
    public CustomerDTO searchCustomer(){
        return new CustomerDTO("C001","Mindula","Matara",5000);
    }

    @PostMapping(path = "/model")
    public String searchDTOCustomer(@ModelAttribute CustomerDTO customerDTO){
        return customerDTO.toString();
    }

    @PostMapping(path = "/array")
    public String saveCustomerWithArray(@RequestBody ArrayList<CustomerDTO> customerDTOArrayList){
        return customerDTOArrayList.toString();
    }

    @PostMapping(path = "/json")
    public String saveCustomerJsonUse(@RequestBody CustomerDTO customerDTO){
        return customerDTO.toString();
    }
}
