/**
 * Representa un objeto libro y algunos metodos definidos
 * @author Andrés Castro
 */

import java.util.ArrayList;

public class Book {
    /**
     * Representa el atributo para identificar el nombre del libro
     */
    public String name;
    /**
     * Representa el atributo para identificar el autor del libro
     */
    private String author;
    /**
     * Representa el atributo para identificar la cantidad de paginas del libro
     */
    protected Integer numPages;
    /**
     * Representa el atributo para identificar el tipo de papel del libro
     */
    private String typePapper;
    /**
     * Representa el atributo para identificar los lenguajes en los cuales esta escrito el libro
     */
    public ArrayList<String> lenguages;
    
    /**
     * Reescribe el metodo toString para imprimir el metodo getAllLenguage
     */
    @Override
    public String toString() {
        return getAllLenguage(lenguages);
    }
    /**
     * 
     * @return Devuelve la lista de lenguajes que fue escrito el libro
     */
    public ArrayList<String> getLenguages() {
        return lenguages;
    }
    /**
     * Define los lenguajes de los cuales fue escrito el libro
     * @param lenguages Lenguajes del libro
     */
    public void setLenguages(ArrayList<String> lenguages) {
        this.lenguages = lenguages;
    }
    /**
     * Recibe los lenguajes escritos del libro y los adicciona al arreglo para mostrarlos de una forma ordenada
     * @param lenguages Leguajes del libro
     * @return
     */
    private String getAllLenguage(ArrayList<String> lenguages){
        String message="El libro viene en los siguientes idiomas: ";
        for(int i=0; i<lenguages.size();i++){
            message += lenguages.get(i);
        }
        return message;
    }
    /**
     * 
     * @return Devuelve el nombre definido para el libro
     */
    public String getName() {
        return name;
    }
    /**
     * Define el nombre del libro creado
     * @param name Nombre del libro creado
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @return Devuelve el nombre del autor que escribio el libro creado
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Define el nombre del autor que escribio el libro creado
     * @param author Nombre del autor del libro
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * 
     * @return Devuelve el número de paginas que tiene el libro creado
     */
    public Integer getNumPages() {
        return numPages;
    }
    /**
     * Define el número de paginas que tiene el libro creado
     * @param numPages  Número de paginas del libro
     */
    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }
    /**
     * 
     * @return Devuelve el tipo de papel que tiene el libro creado
     */
    public String getTypePapper() {
        return typePapper;
    }
    /**
     * Define el tipo de papel que tiene el libro creado
     * @param typePapper Tipo de papel del libro
     */
    public void setTypePapper(String typePapper) {
        this.typePapper = typePapper;
    }
}