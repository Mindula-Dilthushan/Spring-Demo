package lk.service;

import lk.dto.CustomerDTO;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public interface CustomerService {
    boolean addCustomer(CustomerDTO dto);
    boolean deleteCustomer(String id);
    CustomerDTO searchCustomer(String id);
    ArrayList<CustomerDTO> getAllCustomers();
    boolean updateCustomer(CustomerDTO dto);
}
