package za.co.ygf.repository;

import za.co.ygf.domain.Customer;

import java.util.Set;

public interface CustomerRepository {

    void saveCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer findCustomer(Customer customer);

    Set<Customer> findAllCustomers();
}
