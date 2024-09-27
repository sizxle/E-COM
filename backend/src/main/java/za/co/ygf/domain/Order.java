package za.co.ygf.domain;

import za.co.ygf.domain.common.Address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_order")
public class Order {

    @Id
    private String orderNum;


//    private Set<OrderItem> items;


//    private Address address;

    @Column(nullable = false)
    private Boolean isActive;


    public Order() {
    }

    public Order(String orderNum, Address address, Boolean isActive) {
        this.orderNum = orderNum;
//        this.address = address;
        this.isActive = isActive;
//        this.items = new HashSet<OrderItem>();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

//    public Set<OrderItem> getItems() {
//        return items;
//    }
//
//    public void addItem(OrderItem item) {
//        this.items.add(item);
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

//    @Override
//    public String toString() {
//        return "Order{" +
//                "orderNum='" + orderNum + '\'' +
//                ", items=" + items +
//                ", address=" + address +
//                ", isActive=" + isActive +
//                '}';
//    }
}
