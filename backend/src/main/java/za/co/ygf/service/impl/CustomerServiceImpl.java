package za.co.ygf.service.impl;

import org.springframework.stereotype.Service;
import za.co.ygf.domain.Customer;
import za.co.ygf.service.CustomerService;

import java.util.Set;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void registerCustomer(Customer customer) {
        System.out.println("Customer registered");
    }

    @Override
    public void deleteCustomer(Customer customer) {
        System.out.println("Customer deleted");
    }

    @Override
    public void findCustomer(Customer customer) {
        System.out.println("Customer found");
    }

    @Override
    public Set<Customer> findAllCustomers() {
        return Set.of();
    }
}
