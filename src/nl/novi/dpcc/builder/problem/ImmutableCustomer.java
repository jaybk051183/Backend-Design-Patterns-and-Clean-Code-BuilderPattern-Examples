package nl.novi.dpcc.builder.problem;

public class ImmutableCustomer {

    private String firstName;
    private String lastName;
    private String sex;
    private String address;
    private String postalCode;
    private String phoneNumber;

    public ImmutableCustomer(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public ImmutableCustomer(String firstName, String lastName, String sex, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
    }

    public ImmutableCustomer(String firstName, String lastName, String sex, String address, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
        this.postalCode = postalCode;
    }

    public ImmutableCustomer(String firstName, String lastName, String sex, String address, String postalCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }
}
