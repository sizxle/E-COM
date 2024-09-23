package za.co.ygf.domain;

import za.co.ygf.domain.common.Address;

import java.util.Set;

public class Order {

    private String orderNum;

    private Set<OrderItem> items;

    private Address address;

    private Boolean isActive;


    public Order() {
    }

    public Order(String orderNum, Address address, Boolean isActive) {
        this.orderNum = orderNum;
        this.address = address;
        this.isActive = isActive;
    }
}
