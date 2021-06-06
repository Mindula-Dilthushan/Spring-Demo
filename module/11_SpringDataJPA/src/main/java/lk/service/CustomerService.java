package lk.service;

import lk.dto.CustomerDTO;
import lk.entity.Customer;
import lk.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public boolean addCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress(),
                customerDTO.getSalary()
        );
        customerRepo.save(customer);
        return true;
    }
}
