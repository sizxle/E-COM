package za.co.ygf.service.impl;

import za.co.ygf.domain.Order;
import za.co.ygf.service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void createOrder(Order order) {
        System.out.println("Create Order");
    }

    @Override
    public Order findOrderById(String orderNum) {
        return null;
    }

    @Override
    public void updateOrder(Order order) {
        System.out.println("Update Order");
    }

    @Override
    public void deleteOrder(String orderNum) {
        System.out.println("Delete Order");
    }
}
