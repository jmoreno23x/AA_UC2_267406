
public class Ordenamientos {
public static void insertionSort(int[] arreglo) {
    int n = arreglo.length;                    // 1 asignacion

    // Bucle externo: recorre desde el segundo elemento
    for (int i = 1; i < n; i++) {              // n-1 iteraciones

        // Guardar el elemento actual como clave
        int key = arreglo[i];                  // 1 asignacion por iteracion
        int j = i - 1;                         // 1 asignacion por iteracion

        // Desplazar elementos mayores que key hacia la derecha
        while (j >= 0 && arreglo[j] > key) {   // comparacion doble
            arreglo[j + 1] = arreglo[j];       // desplazamiento
            j--;                               // decremento
        }

        // Insertar key en su posicion correcta
        arreglo[j + 1] = key;                  // 1 asignacion por iteracion
    }
}

    public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i] + " ");
    }
    System.out.println();
}

    static void bubbleSort(int[] datos1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}