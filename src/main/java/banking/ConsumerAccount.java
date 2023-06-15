package banking;

/**
 * Account implementation for consumer (domestic) customers.
 * The account's holder is a {@link Person}.
 */

public class ConsumerAccount {
       Person person;
       Long accountNumber;
       int pin;
       double currentBalance;
    public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.currentBalance=currentBalance;
        this.person=person;
    }
}
