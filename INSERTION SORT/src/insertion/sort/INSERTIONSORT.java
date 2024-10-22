package insertion.sort;
import java.util.Scanner;
public class INSERTIONSORT {
    public static void main(String[] args) {
        // INSERTION SORT
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

        // Insertion Sort
        for (int i = 1; i < N; i++) {
            int actual = Array[i];
            int j = i - 1;

            while (j >= 0 && Array[j] > actual) {
                Array[j + 1] = Array[j];
                j--;
            }
            Array[j + 1] = actual;
        }

        System.out.println("\nEl Array ordenado es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    
}
