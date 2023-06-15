package banking;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The Bank implementation.
 */
public class Bank implements BankInterface {
    private LinkedHashMap<Long, Account> accounts;
    private CommercialAccount commercialAccount;
    private ConsumerAccount consumerAccount;

    public Bank() {
        // TODO: complete the constructor
    }

    private Account getAccount(Long accountNumber) {
       try{
           return accounts.get(accountNumber);
       }catch (RuntimeException e){
        throw new RuntimeException("Account Number not found");}

    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {

        throw new RuntimeException("TODO");
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {

            throw new RuntimeException("Account not Created");


    }

    public double getBalance(Long accountNumber) {
        try{
            return accounts.get(accountNumber).getBalance();}
        catch(RuntimeException e){
        throw new RuntimeException("TODO");}
    }

    public void credit(Long accountNumber, double amount) {
        accounts.get(accountNumber).creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {

        if(accounts.get(accountNumber).getBalance()>amount){
            accounts.get(accountNumber).debitAccount(amount);
            return true;
        }
        else{
        throw new RuntimeException("Insufficient funds in your account");}
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
         accounts.get(accountNumber).validatePin(pin);
        throw new RuntimeException("Pin not Valid");
    }
    
    public void addAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        accounts.get(accountNumber).getAccountHolder();
    }

    public boolean checkAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        accounts.get(accountNumber).getAccountHolder().equals(authorizedPerson);
        throw new RuntimeException("Cheking authorized person failed");
    }

    public Map<String, Double> getAverageBalanceReport() {
        throw new RuntimeException("TODO");
    }
}
