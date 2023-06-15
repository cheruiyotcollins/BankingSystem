package banking;

/**
 * Abstract bank account.
 */
public abstract class Account implements AccountInterface {
    private AccountHolder accountHolder;
    private Long accountNumber;
    private int pin;
    private double balance;

    protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.balance=startingDeposit;
    }

    public AccountHolder getAccountHolder() {
       try{
           return accountHolder;
       }catch (RuntimeException e){
           throw new RuntimeException("Account not found");
       }

    }

    public boolean validatePin(int attemptedPin) {
        try{
            if(pin==attemptedPin);
            return true;
        }catch(RuntimeException e){
        throw new RuntimeException("invalid pin");}
    }

    public double getBalance() {
        try{
            return balance;
        }catch(RuntimeException e){
        throw new RuntimeException("Something went wrong");}
    }

    public Long getAccountNumber() {
        try{
            return accountNumber;
        }catch(RuntimeException e){
            throw new RuntimeException("Something went wrong");}
    }

    public void creditAccount(double amount) {
        balance+=balance+amount;
    }

    public boolean debitAccount(double amount) {
       try{ balance=balance-amount;
             return true;
       }
       catch (RuntimeException e){
           throw new RuntimeException("Something went wrong");

       }

    }
}
