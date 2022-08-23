/**
 * Representa un objeto dinosaurio y algunos metodos definidos
 * 
 * @author Andrés Castro
 */

public class Dinosaur {
    /**
     * Representa el atributo para identificar el nombre del dinosaurio
     */
    public String name;
    /**
     * Representa el atributo para identificar el número de patas del dinosaurio
     */
    private Integer numPaws;
    /**
     * Representa el atributo para identificar el tipo de alimentación que tiene el
     * dinosaurio
     */
    protected String feeding;
    /**
     * Representa el atributo para identificar la altura del dinosaurio
     */
    private Double height;

    /**
     * Reescribe el metodo toString para imprimir si el dinosaurio caza o no
     */
    @Override
    public String toString() {
        return getHunt(feeding);
    }

    /**
     * 
     * @param feeding Forma de alimentarse
     * @return Devuelve mensaje denotando que el dinosaurio tiene o no la capacidad
     *         de cazar
     */
    protected String getHunt(String feeding) {
        if (feeding == "carnivorous") {
            return "Si puede cazar";
        } else {
            return "No puede cazar";
        }
    }

    /**
     * 
     * @return Devuelve el nombre del dinosaurio creado
     */
    public String getName() {
        return name;
    }

    /**
     * Define el nombre del dinosaurio creado
     * 
     * @param name Nombre del dinosaurio
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return Devuelve el número de patas que tiene el dinosaurio
     */
    public Integer getNumPaws() {
        return numPaws;
    }

    /**
     * Define el número de patas que tiene el dinosaurio
     * 
     * @param numPaws Número de patas del dinosaurio
     */
    public void setNumPaws(Integer numPaws) {
        this.numPaws = numPaws;
    }

    /**
     * 
     * @return Devuelve el tipo de alimentación que tiene el dinosaurio
     */
    public String getFeeding() {
        return feeding;
    }

    /**
     * Define el tipo de alimentación que tiene el dinosaurio creado
     * 
     * @param feeding Tipo de alimentación
     */
    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    /**
     * 
     * @return Devuelve la altura del dinosaurio creado
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Define la altura del dinosaurio creado
     * 
     * @param height Altura del dinosaurio
     */
    public void setHeight(Double height) {
        this.height = height;
    }
}