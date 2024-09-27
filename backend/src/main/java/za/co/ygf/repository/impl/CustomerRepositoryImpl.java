package za.co.ygf.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import za.co.ygf.domain.Customer;
import za.co.ygf.repository.CustomerRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;


@Repository("CustomerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        entityManager.remove(customer);
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
