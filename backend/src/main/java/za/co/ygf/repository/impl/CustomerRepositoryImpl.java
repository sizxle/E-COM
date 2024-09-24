package za.co.ygf.repository.impl;

import org.springframework.stereotype.Repository;
import za.co.ygf.domain.Customer;
import za.co.ygf.repository.CustomerRepository;

import java.util.Set;

@Repository("CustomerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {


    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("CustomerRepositoryImpl.saveCustomer");
    }

    @Override
    public void deleteCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomer(Customer customer) {
        return null;
    }

    @Override
    public Set<Customer> findAllCustomers() {
        return Set.of();
    }
}
