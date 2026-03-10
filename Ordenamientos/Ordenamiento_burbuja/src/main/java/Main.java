/**
 * Clase principal que ejecuta y demuestra las funcionalidades implementadas.
 * @author Jesus Moreno
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] datos = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        Ordenamientos.imprimirArreglo(datos);

        Ordenamientos.bubbleSort(datos);

        System.out.println("Arreglo ordenado:");
        Ordenamientos.imprimirArreglo(datos);
    }
}