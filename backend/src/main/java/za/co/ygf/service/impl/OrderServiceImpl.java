package za.co.ygf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.ygf.domain.Order;
import za.co.ygf.repository.OrderRepository;
import za.co.ygf.service.OrderService;

import javax.transaction.Transactional;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    public void createOrder(Order order) {
        orderRepository.saveOrder(order);
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
        orderRepository.deleteOrder(orderRepository.findOrder(orderNum));
    }
}
