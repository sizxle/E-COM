package za.co.ygf.service;

import za.co.ygf.domain.Customer;

import java.util.Set;

public interface CustomerService {

    void registerCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    void findCustomer(Customer customer);

    Set<Customer> findAllCustomers();
}
