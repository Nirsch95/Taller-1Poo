/**
 * Representa un objeto cuenta de banco y algunos metodos definidos
 * 
 * @author Andrés Castro
 */
public class BankAccount {
    /**
     * Representa el atributo para identificar la cuenta
     */
    private int accountNumber;
    /**
     * Representa el atributo para identificar si el producto esta activo
     */
    protected boolean activated;

    /**
     * Define el estado de la cuenta activo o inactivo
     * 
     * @param activated Donde se almacena dicho estado
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * 
     * @return Devuelve el estado actual de la cuenta
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * 
     * @return Devuelve el numero de cuenta de la cuenta creada
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el número de cuenta para la cuenta bancaria creada
     * 
     * @param accountNumber Número de cuenta
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
