/**
 * Representa un objeto fruta y algunos metodos definidos
 * @author Andrés Castro
 */

import java.util.ArrayList;

public class Fruit {
    /**
     * Representa el atributo para identificar el nombre de la fruta
     */
    public String name;
    /**
     * Representa el atributo para identificar el promedio de peso de la fruta
     */
    private float averageWeight;
    /**
     * Representa el atributo para identificar los colores que puede tener la fruta
     */
    public ArrayList<String> colors;

    /**
     * 
     * @return Devuelve el nombre de la fruta creada
     */
    public String getName() {
        return name;
    }

    /**
     * Define el nombre de la fruta creada
     * 
     * @param name Nombre de la fruta
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return Devuelve el peso promedio de la fruta creada
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Define el peso promedio de la fruta creada
     * 
     * @param averageWeight Peso promedio de la fruta
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Define la lista de colores que puede tener la fruta creada
     * 
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * 
     * @return Devuelve la lista de colores que puede tener la fruta creada
     */
    public ArrayList<String> getColors() {
        return colors;
    }
}