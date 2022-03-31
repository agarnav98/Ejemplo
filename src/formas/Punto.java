/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class Punto {
    
    /**
     * Atributos: 
     * Coordenada x del punto. 
     * Coordenada y del punto.
     */
    protected int x;
    protected int y;

    //Constructor por defecto.
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor con 2 parametros:
     * @param x
     * @param y
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;       
    }

    //Métodos
    /**
     * Devuelve la coordenada x del punto.
     * @return x.
     */
    public int getX() {
        return x;
    }

    /**
     * Devuelve la coordenada y del punto.
     * @return y.
     */
    public int getY() {
        return y;
    }    

    /**
     * Modifica la coordenada x del punto.
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Modifica la coordenada y del punto.
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    //Método toString para convertirlo en cadena.
    @Override
    public String toString() {
        return "("+getX()+","+getY()+")";
    }
    
}

