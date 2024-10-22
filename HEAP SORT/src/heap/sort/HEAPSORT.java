package heap.sort;
import java.util.Scanner;
public class HEAPSORT {
    public static void main(String[] args) {
        // HEAP SORT
        Scanner sc = new Scanner(System.in);
        int N, n;
        System.out.print("Ingrese la cantidad de elementos del Array: ");
        N = sc.nextInt();
        int Array[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            n = sc.nextInt();
            Array[i] = n;
        }

        System.out.println("El Array original es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();

        // Crear el heap (reorganizar el array)
        for (int i = N / 2 - 1; i >= 0; i--) {
            int padre = i;
            int hizq = 2 * i + 1;
            int hder = 2 * i + 2;

            if (hizq < N && Array[hizq] > Array[padre]) {
                padre = hizq;
            }
            if (hder < N && Array[hder] > Array[padre]) {
                padre = hder;
            }

            if (padre != i) {
                swap(Array, i, padre);
                int j = padre;
                while (true) {
                    padre = j;
                    hizq = 2 * j + 1;
                    hder = 2 * j + 2;

                    if (hizq < N && Array[hizq] > Array[padre]) {
                        padre = hizq;
                    }
                    if (hder < N && Array[hder] > Array[padre]) {
                        padre = hder;
                    }
                    if (padre == j) {
                        break;
                    }
                    swap(Array, j, padre);
                    j = padre;
                }
            }
        }

        // Extraer los elementos del heap uno por uno
        for (int i = N - 1; i >= 0; i--) {
            swap(Array, 0, i);
            int j = 0;
            int heap_size = i;

            while (true) {
                int padre = j;
                int hizq = 2 * j + 1;
                int hder = 2 * j + 2;

                if (hizq < heap_size && Array[hizq] > Array[padre]) {
                    padre = hizq;
                }
                if (hder < heap_size && Array[hder] > Array[padre]) {
                    padre = hder;
                }
                if (padre == j) {
                    break;
                }
                swap(Array, j, padre);
                j = padre;
            }
        }

        System.out.println("\nEl Array ordenado es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    // Función para intercambiar valores en el array
    private static void swap(int[] Array, int i, int j) {
        int temp = Array[i];
        Array[i] = Array[j];
        Array[j] = temp;
    }
}
    
