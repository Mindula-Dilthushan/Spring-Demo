package lk.service.impl;

import lk.dto.CustomerDTO;
import lk.entity.Customer;
import lk.repo.CustomerRepo;
import lk.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

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
        return false;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        return false;
    }
}
