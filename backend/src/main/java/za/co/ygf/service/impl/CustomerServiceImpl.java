package za.co.ygf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.ygf.domain.Customer;
import za.co.ygf.repository.CustomerRepository;
import za.co.ygf.service.CustomerService;

import java.util.Set;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void registerCustomer(Customer customer) {
        customerRepository.saveCustomer(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.deleteCustomer(customer);
    }

    @Override
    public void findCustomer(Customer customer) {
        customerRepository.findCustomer(customer);
    }

    @Override
    public Set<Customer> findAllCustomers() {
       return customerRepository.findAllCustomers();
    }
}
