package nl.novi.dpcc.builder.example;

public class BankAccountBuilder {
    private String firstName;
    private String lastName;
    private String iban;
    private double amount;
    private double interest;

    // In de constructor zetten we de verplichte velden
    public BankAccountBuilder(String iban, double amount, double interest) {
        this.iban = iban;
        this.amount = amount;
        this.interest = interest;
    }

    // We kunnen ook kiezen voor een empty constructor vanwege leesbaarheid
    public BankAccountBuilder() {
    }

    public BankAccountBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public BankAccountBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BankAccountBuilder withIban(String iban) {
        this.iban = iban;
        return this;
    }

    public BankAccountBuilder withAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public BankAccountBuilder withInterest(double interest) {
        this.interest = interest;
        return this;
    }

    public BankAccount build() {
        return new BankAccount(firstName, lastName, iban, amount, interest);
    }

    public BankAccount buildWithEmptyCheck() {
        if(iban.equalsIgnoreCase("")) {
            throw new RuntimeException("Iban cannot be empty");
        }
        return new BankAccount(firstName, lastName, iban, amount, interest);
    }

}
