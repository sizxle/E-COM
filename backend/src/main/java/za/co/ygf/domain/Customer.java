package za.co.ygf.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    private String customerNum;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String password;

    /**
     * On Customer can have many address max 3
     */
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Address> addresses= new ArrayList<Address>();
//
//    private Set<Order> orders new HashSet<Order>();;

    public Customer() {
    }

    public Customer(String customerNum, String name, String surname, String email, String phoneNumber, LocalDate dateOfBirth, String password) {
        this.customerNum = customerNum;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerNum='" + customerNum + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", password='" + password + '\'' +
//                ", address=" + address +
//                ", orders=" + orders +
                '}';
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Address getAddress() {
////        return address;
//    }

    public void setAddress(Address address) {
        this.addresses.add(address);
    }

    public Order getOrders(String OrderNum) {
        return new Order(); //TO:DO
    }

    public void addOrder(Order order) {
//        this.orders.add(order);
    }
}
