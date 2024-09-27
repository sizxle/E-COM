package za.co.ygf.domain;

import javax.persistence.*;

@Entity
@Table(name = "customer_order")
public class Order {

    @Id
    private String orderNum;


//    private Set<OrderItem> items = new HashSet<OrderItem>();

    @Column(nullable = false)
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "customer_num")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;



    public Order() {
    }

    public Order(String orderNum, Address address, Boolean isActive,Customer customer) {
        this.orderNum = orderNum;
        this.address = address;
        this.isActive = isActive;
        this.customer = customer;
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
