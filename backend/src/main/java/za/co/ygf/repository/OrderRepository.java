package za.co.ygf.repository;

import za.co.ygf.domain.Order;

import java.util.List;

public interface OrderRepository {

    void saveOrder(Order order);

    void deleteOrder(Order order);

    Order findOrder(String orderNum);

    List<Order> findAllOrders();

}
