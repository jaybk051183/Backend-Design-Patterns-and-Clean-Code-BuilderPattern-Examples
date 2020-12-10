package nl.novi.dpcc.builder.example;

public class BankAccountExampleMain {
    public static void main(String[] args) {
        // Met constructor met verplichte velden
        BankAccount richPerson = new BankAccountBuilder("RABOING123", 1200000, 0.2).build();

        //Met lege constructor
        BankAccount anotherPerson = new BankAccountBuilder().withFirstName("Nick").withLastName("Stuivenberg")
                .withAmount(20).withInterest(1.5).withIban("NLPOSTBANK1").buildWithEmptyCheck();
    }
}
