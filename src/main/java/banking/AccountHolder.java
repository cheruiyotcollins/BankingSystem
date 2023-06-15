package banking;

/**
 * Abstract Account Holder.
 */
public abstract class AccountHolder {
    private int idNumber;
    
    /**
     * @param idNumber The holder unique ID.
     */
    protected AccountHolder(int idNumber) {
        this.idNumber=idNumber;
    }

    public int getIdNumber() {
       try{ return idNumber;}
       catch (RuntimeException e){
        throw new RuntimeException("idNumber not found");}
    }
}
