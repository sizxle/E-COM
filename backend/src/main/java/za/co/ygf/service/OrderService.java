package za.co.ygf.service;

import za.co.ygf.domain.Order;

public interface OrderService {

    void createOrder(Order order);

    Order findOrderById(String orderNum);

    void updateOrder(Order order);

    void deleteOrder(String orderNum);

}
