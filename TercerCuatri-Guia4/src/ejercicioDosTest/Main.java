package ejercicioDosTest;

import ejercicioDos.Animal;

public class Main {
    public static void main(String[] args) {

        /*Supongamos que estamos trabajando en un programa que modela un ecosistema en el que existen diferentes
        animales. Queremos definir una interfaz "Elemento" que contenga los métodos comunes a todos los elementos
        del ecosistema, como por ejemplo la posición en el espacio y la representación gráfica. Además, queremos
        que los Elefantes están especificados, queremos definir una clase anidada "Coordenada" que representa las
        coordenadas (x, y, z) de los elementos.*/


        Animal elefante = new Animal("Elefante Loxodonta Africana");
        Animal.Coordenada coordenada = elefante.new Coordenada(10.0d, 55.6d, 45.1d);

        coordenada.mostrarCoornedadas();


    }
}
