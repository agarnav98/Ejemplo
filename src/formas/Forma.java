/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class Forma {
   
    /**
     * Atributos:
     * Color de la forma.
     * Coordenada centro de la forma, instancia de Punto. 
     * Nombre de la forma.
     */
    protected String color;
    protected Punto centro;
    protected char nombre;

    //Constructor por defecto.
    public Forma() {
        this.centro = new Punto();
        this.color = "rojo";
        this.nombre = 'F';
    }

    /**
     * Constructor con 4 parametros:
     * @param x
     * @param y
     * @param color
     * @param nombre
     */
    public Forma(int x, int y, String color, char nombre) {
        this.centro = new Punto(x, y);
        this.color = color;
        this.nombre = nombre;   
    }

    //Métodos
    /**
     * Devuelve el centro de la figura.
     * @return centro.
     */
    public Punto getCentro() {
        return centro;
    }
    
    /**
     * Devuelve el color de la figura.
     * @return color.
     */
    public String getColor() {
        return color;
    }    
    
    /**
     * Devuelve el nombre de la figura.
     * @return nombre.
     */
    public char getNombre() {
        return nombre;
    }
    
    /**
     * Modifica el centro de la figura.
     * @param centro
     */
    public void setCentro(Punto centro) {
        this.centro = new Punto(centro.getX(), centro.getY());
    }

    /**
     * Modifica el color de la figura.
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    } 

    /**
     * Modifica el nombre de la figura.
     * @param nombre
     */
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }    
    
    //Método toString para convertirlo en cadena.
    @Override
    public String toString() {
        return "centro="+getCentro().toString()+",color="+getColor()+",forma="+getNombre();
    } 
    
    //Método para mover el centro arriba
    public void moverArriba() {
        this.centro.y += 1;
    }     

    //Método para mover el centro abajo.
    public void moverAbajo() {
        this.centro.y -= 1;
    }

    //Método para mover el centro izquierda.
    public void moverIzquierda() {
        this.centro.x -= 1;
    }   

    //Método para mover el centro derecha.
    public void moverDerecha() {
        this.centro.x += 1;
    }  
    
}
