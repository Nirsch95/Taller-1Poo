/**
 * Representa un objeto carro y algunos metodos definidos
 * 
 * @author Andrés Castro
 */

public class Car {
    /**
     * Representa el atributo para identificar la marca del carro
     */
    public String brand;
    /**
     * Representa al atributo para identificar el número de puertas del carro
     */
    private Integer numDoor;
    /**
     * Representa el atributo para identificar el tipo de motor del carro
     */
    protected String typeMotor;
    /**
     * Representa el atributo para identificar el tipo de tracción del carro
     */
    private String tractionType;

    /**
     * Reescribe el metodo toString para imprimir el tipo de carro basado en los
     * atributos
     */
    @Override
    public String toString() {
        return getTypeCar(typeMotor, tractionType);
    }

    /**
     * 
     * @param typeMotor    Tipo de motor
     * @param tractionType Tipo de tracción
     * @return Devuelve el arreglo que describe que tipo de carro
     */
    private String getTypeCar(String typeMotor, String tractionType) {
        return "El carro tiene motor " + typeMotor + " y tracción " + tractionType;
    }

    /**
     * 
     * @return Devuelve la marca del carro creado
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define el nombre de la marca del carro creado
     * 
     * @param brand Marca del carro
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return Devuelve el número de puertas que tiene el carro creado
     */
    public Integer getNumDoor() {
        return numDoor;
    }

    /**
     * Define la cantidad de puertas que tiene el carro creado
     * 
     * @param numDoor Número de puertas
     */
    public void setNumDoor(Integer numDoor) {
        this.numDoor = numDoor;
    }

    /**
     * 
     * @return Devuelte el tipo de motor que tiene el carro creado
     */
    public String getTypeMotor() {
        return typeMotor;
    }

    /**
     * Define el tipo de motor que tiene el carro creado
     * 
     * @param typeMotor Tipo de motor
     */
    public void setTypeMotor(String typeMotor) {
        this.typeMotor = typeMotor;
    }

    /**
     * 
     * @return Devuelve el tipo de tracción que tiene el carro creado
     */
    public String getTractionType() {
        return tractionType;
    }

    /**
     * Define el tipo de tracción que tiene el carro creado
     * 
     * @param tractionType Tipo de tracción
     */
    public void setTractionType(String tractionType) {
        this.tractionType = tractionType;
    }
}
