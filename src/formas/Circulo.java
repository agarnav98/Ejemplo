/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class Circulo extends Elipse {
    
    /**
     * Atributos:
     * Heredados de la clase Elipse
     */

    //Constructor por defecto.
    public Circulo() {
        super();
    }

    /**
     * Constructor con 5 parametros:
     * @param x
     * @param y
     * @param color
     * @param nombre
     * @param radio
     */
    public Circulo(int x, int y, String color, char nombre, double radio) {
        super(x, y, color, nombre, radio, radio);
    }

    //Métodos
    /**
     * Devuelve el radio del círculo.
     * @return radio.
     */
    public double getRadio() {
        return radioMenor;
    }
    
    /**
     * Modifica el radio del círculo.
     * @param radio
     */
    public void setRadio(double radio) {
        this.radioMenor = radio;
        this.radioMayor = radio;
    } 

    /**
     * Modifica el radio del círculo.
     * @param radio
     */
    @Override
    public void setRadioMenor(double radio) {
        this.radioMenor = radio;
        this.radioMayor = radio;
    }

    /**
     * Modifica el radio del círculo.
     * @param radio
     */
    @Override
    public void setRadioMayor(double radio) {
        this.radioMayor = radio;
        this.radioMenor = radio;
    }          
}
