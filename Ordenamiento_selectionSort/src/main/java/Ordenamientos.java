/**
 * Clase que implementa el algoritmo de ordenamiento.
 * @author Jesus Moreno 
 * @version 1.0
 */
public class Ordenamientos {

    /**
     * Método que implementa el algoritmo Selection Sort.
     * @param arreglo El arreglo de enteros a ordenar
     */
    public static void selectionSort(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[minIdx];
                arreglo[minIdx] = temp;
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}