package selection.sort;
import java.util.Scanner;
public class SELECTIONSORT {
    public static void main(String[] args) {
        // SELECTION SORT
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

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Array[i] > Array[j]) {
                    // Swap sin usar una función
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }

        System.out.println("\nEl Array ordenado es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    
}
