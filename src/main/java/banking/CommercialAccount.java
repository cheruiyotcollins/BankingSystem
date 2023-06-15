package banking;

import java.util.List;

/**
 * Account implementation for commercial (business) customers.
 * The account's holder is a {@link Company}.
 */
public class CommercialAccount {
    private List<Person> authorizedUsers;
    Company company;
    Long accountNumber;
    int pin;
    double startingDeposit;

    public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
        this.accountNumber=accountNumber;
        this.company=company;
        this.pin=pin;
        this.startingDeposit=startingDeposit;
    }

    /**
     * Add person to list of authorized users.
     *
     * @param person The authorized user to be added to the account.
     */
    protected boolean addAuthorizedUser(Person person) {
        boolean authorized=false;
        for(int i=0; i<authorizedUsers.size();i++){
            if(authorizedUsers.get(i).equals(person)){
                authorized=true;
            }

        }
        return authorized;
    }

    /**
     * Verify if the person is part of the list of authorized users for this account.
     *
     * @param person
     * @return <code>true</code> if person matches an authorized user in {@link #authorizedUsers}; <code>false</code> otherwise.
     */
    public boolean isAuthorizedUser(Person person) {
        try{boolean authorized=false;
        for(int i=0; i<authorizedUsers.size();i++){
            if(authorizedUsers.get(i).equals(person)){
                authorized=true;
            }

        }
        return authorized;} catch(RuntimeException e){
        throw new RuntimeException("TODO");}
    }
}
