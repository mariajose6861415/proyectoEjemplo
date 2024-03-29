package org.example;

/**
 * Clase para probar el Javadoc
 * @author María José Casalins Pina
 * @version 1.0
 */
public class Main {


    public static void main(String[] args) {
        System.out.println("Comienza el programa");
        int n = 5; //Tamaño del array
        int[] tabla = new int[n];
        tabla = llenar(n); //Inicializamos el array
        int suma = sumar(tabla); //Calculamos el sumatorio
        System.out.println("La suma es: " + suma);
        imprimirArray(tabla);

    }
    public static void imprimirArray(int[] tabla){
        for (int i = 0; i < tabla.length; i++) //Recorrido
            System.out.println(tabla[i]);
    }
    public static int[] llenar(int n) {
        int[] tabla = new int[n]; //Creación del array
        for (int i = 0; i < n; i++) //Recorrido
            tabla[i] = i * 10; //Incialización
        return tabla; //Devuelve el array
    }// llenar tabla

    public static int sumar(int[] tabla) {
        int suma = 0; //Inicializa suma
        int n = tabla.length; //Guarda la longitud del array
        for (int i = 0; i < n; i++) //Recorre el array
            suma = suma + tabla[i]; //Realiza el sumatorio
        return suma; //Devuelve la suma
    }// sumar tabla
}