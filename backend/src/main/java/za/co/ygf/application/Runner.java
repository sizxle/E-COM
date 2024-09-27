package za.co.ygf.application;

import za.co.ygf.domain.Customer;
import za.co.ygf.domain.Item;
import za.co.ygf.domain.Order;
import za.co.ygf.domain.OrderItem;
import za.co.ygf.domain.Address;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        Customer customer = new Customer("cus111","jane","molefi","sthembizomolefi@gmail.com","0981231234", LocalDate.now(),"password");

        Address address = new Address("Home", "Zeerust", "2880",customer);

        Order order = new Order("ord111",address,true);

        Item item= new Item("item11","Shirt","just a cool tee","image of shirt","250");

        OrderItem orderItem = new OrderItem("ww",order,item,2);


        System.out.println(customer);

//        order.addItem(orderItem);
        customer.addOrder(order);

        System.out.println(customer);


    }
}
