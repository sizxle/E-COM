package za.co.ygf.domain.common;

public class Address {

    private String addressName;

    private String city;

    private String zipCode;

    public Address() {
    }

    public Address(String addressName, String city, String zipCode) {
        this.addressName = addressName;
        this.city = city;
        this.zipCode = zipCode;
    }
}
