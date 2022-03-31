/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class Rectangulo extends Forma {
    
    /**
     * Atributos:
     * Heredados de la clase Forma
     * Lado menor del rectángulo. 
     * Lado mayor del rectángulo.
     */
    protected double ladoMenor;
    protected double ladoMayor;

    //Constructor por defecto.
    public Rectangulo() {
        super();
        this.ladoMenor = 0;
        this.ladoMayor = 0;
    }

    /**
     * Constructor con 6 parametros:
     * @param x
     * @param y
     * @param color
     * @param nombre
     * @param ladoMenor
     * @param ladoMayor
     */
    public Rectangulo(int x, int y, String color, char nombre, double ladoMenor, double ladoMayor) {
        super(x, y, color, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    //Métodos
    /**
     * Devuelve el lado menor del rectángulo.
     * @return ladoMenor.
     */
    public double getLadoMenor() {
        return ladoMenor;
    }
    
    /**
     * Devuelve el lado mayor del rectángulo.
     * @return ladoMayor.
     */
    public double getLadoMayor() {
        return ladoMayor;
    }   
    
    /**
     * Modifica el lado menor del rectángulo.
     * @param ladoMenor
     */
    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    /**
     * Modifica el lado mayor del rectángulo.
     * @param ladoMayor
     */
    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }   
    
    //Método toString para convertirlo en cadena.
    @Override
    public String toString() {
        return super.toString()+",lado menor="+getLadoMenor()+",lado mayor="+getLadoMayor();
    } 
    
    //Método para calcular el área del rectángulo.
    public double getArea() {
        return getLadoMenor() * getLadoMayor();
    }
    
    //Método para calcular el perímetro del rectángulo.
    public double getPerimetro() {
        return 2 * getLadoMenor() + 2 * getLadoMayor();
    }
    
    //Método para cambiar el tamaño del rectángulo.
    public void redimensionar(double escala) {
        setLadoMayor(getLadoMayor() * escala);
        setLadoMenor(getLadoMenor() * escala);
    }       
}
