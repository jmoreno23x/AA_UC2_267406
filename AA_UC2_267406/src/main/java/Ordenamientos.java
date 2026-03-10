/**
 * Clase que implementa el algoritmo de Ordenamiento en Burbuja.
 * Incluye conteo de operaciones elementales para análisis de complejidad.
 * @author Jesus Moreno
 * @version 1.0
 */
public class Ordenamientos {

    /**
     * Método que implementa el algoritmo Bubble Sort.
     * Ordena un arreglo de enteros de menor a mayor.
     *
     * @param arreglo El arreglo de enteros a ordenar
     *
     * Análisis de operaciones elementales:
     *   - Comparación i < n-1         → se ejecuta (n) veces
     *   - Comparación j < n-1-i       → se ejecuta n*(n-1)/2 veces
     *   - Comparación arreglo[j]>...  → se ejecuta n*(n-1)/2 veces
     *   - Asignaciones (intercambio)  → máximo 3 * n*(n-1)/2 veces
     *
     * Expresión algebraica total: T(n) = n + 3*n*(n-1)/2 ≈ (3/2)n² - (1/2)n
     * Notación asintótica: O(n²)
     */
    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;               // 1 asignación

        // Bucle externo: controla el número de pasadas
        for (int i = 0; i < n - 1; i++) {     // n comparaciones (bucle externo)

            // Bucle interno: realiza las comparaciones adyacentes
            for (int j = 0; j < n - 1 - i; j++) {  // n*(n-1)/2 comparaciones

                // Comparación de elementos adyacentes
                if (arreglo[j] > arreglo[j + 1]) {  // 1 comparación por iteración

                    // Intercambio de elementos (3 asignaciones)
                    int temp = arreglo[j];           // asignación 1
                    arreglo[j] = arreglo[j + 1];     // asignación 2
                    arreglo[j + 1] = temp;           // asignación 3
                }
            }
        }
    }

    /**
     * Método principal para probar el algoritmo.
     * @param args
     */
    public static void main(String[] args) {
        int[] datos = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        bubbleSort(datos);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(datos);
    }

    /**
     * Método auxiliar para imprimir un arreglo.
     * @param arreglo
     */
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
