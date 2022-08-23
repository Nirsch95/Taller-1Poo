/**
 * Representa un objeto persona y algunos metodos definidos
 * @author Andrés Castro
 */

import java.sql.Date;

public class Person {
    /**
     * Representa el atributo para identificar el nombre de la persona
     */
    public String name;
    /**
     * Representa el atributo para identificar el primer apellido de la persona
     */
    public String lastName1;
    /**
     * Representa el atributo para identificar el segundo apellido de la persona
     */
    public String lastName2;
    /**
     * Representa el atributo para identificar la fecha de nacimiento de la persona
     */
    public Date dateBirth;
    /**
     * Representa el atributo para identificar la altura de la persona
     */
    public float height;

    /**
     * Define el nombre de la persona creada
     * 
     * @param name Nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return Devuelve el nombre de la persona creada
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return Devuelve el primer apellido de la persona creada
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Define el primer apellido de la persona creada
     * 
     * @param lastName1 Primer apellido de la persona
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * 
     * @return Devuelve el segundo apellido de la persona creada
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Define el segundo apellido de la persona creada
     * 
     * @param lastName2 Segundo apellido de la persona
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * 
     * @return Devuelve la fecha de nacimiento de la persona creada
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Define la fecha de nacimieto de la persona creada
     * 
     * @param dateBirth Fecha de nacimiento de la persona
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * 
     * @return Devuelve la altura de la persona creada
     */
    public float getHeight() {
        return height;
    }

    /**
     * Define la altura de la persona creada
     * 
     * @param height Altura de la persona
     */
    public void setHeight(float height) {
        this.height = height;
    }
}