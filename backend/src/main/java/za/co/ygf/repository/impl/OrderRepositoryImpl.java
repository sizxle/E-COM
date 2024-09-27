package za.co.ygf.repository.impl;

import org.springframework.stereotype.Repository;
import za.co.ygf.domain.Order;
import za.co.ygf.repository.OrderRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveOrder(Order order) {
        entityManager.persist(order);
    }

    @Override
    public void deleteOrder(Order order) {
        entityManager.remove(order);
    }

    @Override
    public Order findOrder(String orderNum) {
        return null;
    }

    @Override
    public List<Order> findAllOrders() {
        return List.of();
    }
}
