package nl.novi.dpcc.builder.problem;

public class ImmutableBankAccount {

    private double interest;
    private double amount;

    public ImmutableBankAccount(double interest, double amount) {
        this.interest = interest;
        this.amount = amount;
    }

}
