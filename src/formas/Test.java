/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 * @author Alberto García Navarro
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class Test {
    
    //Clase main donde realizaremos las pruebas.
    public static void main(String[] args) {
        //Vamos a crear varias formas mediante polimorfismo, llamando a la clase Forma.
        
        //Creamos el rectangulo 'rectangulo' con el constructor por parámetros.
        Forma rectangulo = new Rectangulo(2, 3, "azul", 'R', 3, 5);

        //Mostramos por pantalla los datos del rectángulo.
        System.out.println(rectangulo);
        
        //Cambiamos el color, movemos el centro y volvemos a mostrar los datos.
        rectangulo.setColor("rojo");
        rectangulo.moverArriba();
        System.out.println(rectangulo);
        
        //Creamos el cuadrado 'cuadrado' con el constructor por parámetros.
        Forma cuadrado = new Cuadrado(2, 3, "azul", 'R', 3);

        //Mostramos por pantalla los datos del cuadradoo.
        System.out.println(cuadrado);
        
        //Cambiamos el color, movemos el centro y volvemos a mostrar los datos.
        cuadrado.setColor("rojo");
        cuadrado.moverArriba();
        System.out.println(cuadrado);

        //Creamos la elipse 'elipse' con el constructor por parámetros.
        Forma elipse = new Elipse(2, 3, "azul", 'R', 3, 5);

        //Mostramos por pantalla los datos del cuadrado.
        System.out.println(elipse);
        
        //Cambiamos el color, movemos el centro y volvemos a mostrar los datos.
        elipse.setColor("rojo");
        elipse.moverArriba();
        System.out.println(elipse);

        //Creamos el círculo 'circulo' con el constructor por parámetros.
        Forma circulo = new Circulo(2, 3, "azul", 'R', 3);

        //Mostramos por pantalla los datos del circulo.
        System.out.println(circulo);
        
        //Cambiamos el color, movemos el centro y volvemos a mostrar los datos.
        circulo.setColor("rojo");
        circulo.moverArriba();
        System.out.println(circulo);        
    }

}
