package za.co.ygf.domain;


import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String addressName;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String zipCode;

    @ManyToOne
    @JoinColumn(name="customer_num")
    private Customer customer;

    public Address() {
    }

    public Address(String addressName, String city, String zipCode, Customer customer) {
        this.addressName = addressName;
        this.city = city;
        this.zipCode = zipCode;
        this.customer=customer;
    }
}
