package banking;

/**
 * The concrete Account holder of Person type.
 */
public class Person {
    private String firstName;
    private String lastName;

    private int idNumber;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=idNumber;
    }

    public String getFirstName() {
        try{
            return firstName;
        }catch(RuntimeException e){
            throw new RuntimeException("first name not found");
        }

    }

    public String getLastName() {
        try{
            return lastName;
        }catch(RuntimeException e){
            throw new RuntimeException("last name not found");
        }
    }
}
