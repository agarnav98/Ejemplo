/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class Elipse extends Forma {
    
    /**
     * Atributos:
     * Heredados de la clase Forma
     * Radio menor de la elipse. 
     * Radio mayor de la elipse.
     */
    protected double radioMenor;
    protected double radioMayor;

    //Constructor por defecto.
    public Elipse() {
        super();
        this.radioMenor = 0;
        this.radioMayor = 0;
    }

    /**
     * Constructor con 6 parametros:
     * @param x
     * @param y
     * @param color
     * @param nombre
     * @param radioMenor
     * @param radioMayor
     */
    public Elipse(int x, int y, String color, char nombre, double radioMenor, double radioMayor) {
        super(x, y, color, nombre);
        this.radioMenor = radioMenor;
        this.radioMayor = radioMayor;
    }

    //Métodos
    /**
     * Devuelve el radio menor de la elipse.
     * @return radioMenor.
     */
    public double getRadioMenor() {
        return radioMenor;
    }
    
    /**
     * Devuelve el radio mayor de la elipse.
     * @return radioMayor.
     */
    public double getRadioMayor() {
        return radioMayor;
    }   
    
    /**
     * Modifica el radio menor de la elipse.
     * @param radioMenor
     */
    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    /**
     * Modifica el radio mayor de la elipse.
     * @param radioMayor
     */
    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }   
    
    //Método toString para convertirlo en cadena.
    @Override
    public String toString() {
        return super.toString()+",radio menor="+getRadioMenor()+",radio mayor="+getRadioMayor();
    } 
    
    //Método para calcular el área de la elipse.
    public double getArea() {
        return Math.PI * getRadioMenor() * getRadioMayor();
    }
    
    //Método para calcular el perímetro de la elipse.
    public double getPerimetro() {
        return Math.PI * (getRadioMenor() + getRadioMayor());
    }
    
    //Método para cambiar el tamaño de la elipse.
    public void redimensionar(double escala) {
        setRadioMayor(getRadioMayor() * escala);
        setRadioMenor(getRadioMenor() * escala);
    }       
}
