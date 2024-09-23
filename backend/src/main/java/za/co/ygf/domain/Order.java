package za.co.ygf.domain;

import za.co.ygf.domain.common.Address;

import java.util.Set;

public class Order {

    private String orderNum;

    private Set<OrderItem> items;

    private Address address;

    private Boolean isActive;


}
