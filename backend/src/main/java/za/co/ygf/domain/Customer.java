package za.co.ygf.domain;

import za.co.ygf.domain.common.Address;

import java.time.LocalDate;
import java.util.Set;

public class Customer {

    private String customerNum;

    private String name;

    private String surname;

    private String email;

    private String phoneNumber;

    private LocalDate dateOfBirth;

    private String password;

    private Address address;

    private Set<Order> orders;

    public Customer() {
    }

    public Customer(String customerNum, String name, String surname, String email, String phoneNumber, LocalDate dateOfBirth, String password, Address address) {
        this.customerNum = customerNum;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.address = address;
    }
}
