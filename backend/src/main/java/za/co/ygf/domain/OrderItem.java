package za.co.ygf.domain;

public class OrderItem {

    private String id;

    private Order order;

    private Item item;

    private Integer quantity;

    public OrderItem() {
    }

    public OrderItem(String id, Order order, Item item, Integer quantity) {}
}
