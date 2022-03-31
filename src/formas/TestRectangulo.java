/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class TestRectangulo {
    
    //Clase main donde realizaremos las pruebas.
    public static void main(String[] args) {

        //Creamos el rectangulo 'rectangulo' con el constructor por parámetros.
        Rectangulo rectangulo = new Rectangulo(2, 3, "azul", 'R', 3, 5);

        //Mostramos por pantalla los datos del rectángulo.
        System.out.println(rectangulo);
        
        //Cambiamos el color, movemos el centro y volvemos a mostrar los datos.
        rectangulo.setColor("rojo");
        rectangulo.moverArriba();
        System.out.println(rectangulo);
        
        //Mostramos por pantalla el perímetro y el área del rectángulo.
        System.out.println(rectangulo.getPerimetro());
        System.out.println(rectangulo.getArea());
               
        //Redimensionamos el rectángulo a la mitad y moostramos sus datos por pantalla.
        rectangulo.redimensionar(0.5);
        System.out.println(rectangulo); 
    }

}
