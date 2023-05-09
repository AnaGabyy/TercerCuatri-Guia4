package ejercicioUnoTest;

import ejercicioUno.Cuadrado;
import ejercicioUno.FiguraGeometrica;

public class Main {
    public static void main(String[] args) {

        /*Supongamos que estamos trabajando en un programa que maneja diferentes formas geométricas, y queremos definir
        una interfaz "Figura" que contenga los métodos comunes a todas las formas, cómo calcular el área y el perímetro.
        Además, queremos definir una clase anidada "Punto" que representa las coordenadas (x,y) de los vértices de las
        formas.*/

        Cuadrado cuadrado = new Cuadrado("Cuadrado", 10.0d);

        System.out.println(cuadrado.getAnchoAlto());

        System.out.println(cuadrado.calcularArea());

        System.out.println(cuadrado.calcularPerimetro());

        Cuadrado.Punto puntos = cuadrado.new Punto(20,10);

        System.out.println(puntos.mostrarPuntos());


    }
}
