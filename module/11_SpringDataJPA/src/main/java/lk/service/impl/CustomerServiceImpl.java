package lk.service.impl;

import lk.dto.CustomerDTO;
import lk.entity.Customer;
import lk.repo.CustomerRepo;
import lk.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public boolean addCustomer(CustomerDTO dto) {
        customerRepo.save(new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary()));
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
        CustomerDTO customerDTO = searchCustomer(id);
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());
        customerRepo.delete(customer);
        return true;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()) {
            Customer c = customer.get();
            return new CustomerDTO(c.getId(), c.getName(), c.getAddress(), c.getSalary());
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        List<Customer> all = customerRepo.findAll();
        for (Customer c : all) {
            allCustomers.add(new CustomerDTO(c.getId(), c.getName(), c.getAddress(), c.getSalary()));
        }
        return allCustomers;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getId())) {
            Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
            customerRepo.save(customer);
            return true;
        }
        return false;
    }
}
