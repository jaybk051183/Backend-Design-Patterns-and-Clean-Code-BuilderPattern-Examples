package nl.novi.dpcc.builder.example;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String iban;
    private double amount;
    private double interest;

    public BankAccount(String firstName, String lastName, String iban, double amount, double interest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
        this.amount = amount;
        this.interest = interest;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
