/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class Cuadrado extends Rectangulo {
    
    /**
     * Atributos:
     * Heredados de la clase Rectangulo
     */

    //Constructor por defecto.
    public Cuadrado() {
        super();
    }

    /**
     * Constructor con 5 parametros:
     * @param x
     * @param y
     * @param color
     * @param nombre
     * @param lado
     */
    public Cuadrado(int x, int y, String color, char nombre, double lado) {
        super(x, y, color, nombre, lado, lado);
    }

    //Métodos
    /**
     * Devuelve el lado del cuadrado.
     * @return lado.
     */
    public double getLado() {
        return ladoMenor;
    }
      
    /**
     * Modifica el lado del cuadrado.
     * @param lado
     */
    public void setLado(double lado) {
        this.ladoMenor = lado;
        this.ladoMayor = lado;
    } 

    /**
     * Modifica el lado del cuadrado.
     * @param lado
     */
    @Override
    public void setLadoMenor(double lado) {
        this.ladoMenor = lado;
        this.ladoMayor = lado;
    }

    /**
     * Modifica el lado del cuadrado.
     * @param lado
     */
    @Override
    public void setLadoMayor(double lado) {
        this.ladoMayor = lado;
        this.ladoMenor = lado;
    }         
}
