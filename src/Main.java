// Ejercicio Tema 3
// Primera parte:
// - Crear una función con tres parámetros que sean números que se suman entre sí.
// - Llamar a la función en el main y darle valores.
//
// Segunda parte:
// - Crear una clase coche.
// - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// - Una función que incremente el número de puertas que tiene el coche.
// - Crear un objeto miCoche en el main y añadirle una puerta.
// - Mostrar el número de puertas que tiene el objeto.

public class Main {
    public static void main(String[] args) {
    // Parte 1:
    // Se llama en el main a la función creada (dentro de una variable) y
    // se le da valor a los tres parámetros, pero no se muestran los
    // resultados de la función.

        var resultado = suma(10, 3, 2);

    // Para mostrar el resultado de la sumatoria puedo hacer un System.out.println de la variable

        System.out.println("Parte 1: La suma de a+b+c es igual a " + resultado);

    // Parte 2:
    // Creo una instancia de Coche llamada multiPuertas sobre el que llamo el método aumentarPuertas
    // y finalmente muestro el número de puertas de esa instancia accediendo al valor de la variable
    // que almacena el número de puertas en esa instancia.

        Coche multiPuertas = new Coche();
        multiPuertas.aumentarPuertas();
        System.out.println("Parte 2: El coche tiene " + multiPuertas.puertas + " puertas");
    }

    // Parte 1:
    // Se define la función "suma", con tres parámetros: "a", "b" y "c", que se suman entre sí.

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

// Parte 2:
// Se crea la clase "Coche" con la propiedad "puertas" y el método "aumentarPuertas";

class Coche {
    // Variable que almacena el número de puertas
    public int puertas = 0;

    // Función que incrementa el número de puertas
    public void aumentarPuertas(){
        this.puertas++;
    }
}