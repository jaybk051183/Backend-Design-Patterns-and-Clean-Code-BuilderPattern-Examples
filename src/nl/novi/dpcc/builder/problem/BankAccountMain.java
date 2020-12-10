package nl.novi.dpcc.builder.problem;

public class BankAccountMain {

    public static void main(String[] args) {
        // We maken twee nieuwe bankaccunts aan. Eentje begint met 100 euro en krijgt 2,5 pct rente.
        // De andere begint met 1250 euro en krijgt 1 pct rente.

        ImmutableBankAccount bankAccount = new ImmutableBankAccount(2.5, 100.0);
        ImmutableBankAccount anotherBankAccount = new ImmutableBankAccount(1250.0, 1.0);
    }
}
