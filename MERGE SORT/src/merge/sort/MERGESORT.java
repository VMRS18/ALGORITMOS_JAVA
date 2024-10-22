package merge.sort;
import java.util.Scanner;
public class MERGESORT {
    public static void main(String[] args) {
         // MERGE SORT
        Scanner sc = new Scanner(System.in);
        int N, n;
        System.out.print("Ingrese la cantidad de elementos del Array: ");
        N = sc.nextInt();
        int[] Array = new int[N];
        
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

        // Merge Sort
        for (int m = 1; m < N; m *= 2) {
            for (int Iizq = 0; Iizq < N; Iizq += 2 * m) {
                int medio = Math.min(Iizq + m, N);
                int Fder = Math.min(Iizq + 2 * m, N);

                int tam_izq = medio - Iizq;
                int tam_der = Fder - medio;

                // Creamos sub Arrays temporales
                int[] IZQ = new int[tam_izq];
                int[] DER = new int[tam_der];

                // Copiamos los valores a los nuevos sub arrays
                for (int i = 0; i < tam_izq; i++) {
                    IZQ[i] = Array[Iizq + i];
                }
                for (int j = 0; j < tam_der; j++) {
                    DER[j] = Array[medio + j];
                }

                int i = 0, j = 0, k = Iizq;

                // Combina las sub listas
                while (i < tam_izq && j < tam_der) {
                    if (IZQ[i] <= DER[j]) {
                        Array[k] = IZQ[i];
                        i++;
                    } else {
                        Array[k] = DER[j];
                        j++;
                    }
                    k++;
                }

                // Terminamos de copiar los datos que faltan
                while (i < tam_izq) {
                    Array[k] = IZQ[i];
                    i++;
                    k++;
                }
                while (j < tam_der) {
                    Array[k] = DER[j];
                    j++;
                    k++;
                }
            }
        }

        System.out.println("\nEl Array ordenado es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    
}
