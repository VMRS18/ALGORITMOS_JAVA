package quick.sort;
import java.util.Scanner;
public class QUICKSORT {
    public static void main(String[] args) {
         // QUICK SORT
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

        int[] stack = new int[N];
        int top = -1;

        // Almacenamos el rango inicial
        stack[++top] = 0;
        stack[++top] = N - 1;

        while (top >= 0) {
            int alto = stack[top--];
            int bajo = stack[top--];

            int pivote = Array[alto];
            int i = bajo - 1;

            // Partimos el Array
            for (int j = bajo; j < alto; j++) {
                if (Array[j] <= pivote) {
                    i++;
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }

            int temp = Array[i + 1];
            Array[i + 1] = Array[alto];
            Array[alto] = temp;

            int Lugarpivote = i + 1;

            if (Lugarpivote - 1 > bajo) {
                stack[++top] = bajo;
                stack[++top] = Lugarpivote - 1;
            }
            if (Lugarpivote + 1 < alto) {
                stack[++top] = Lugarpivote + 1;
                stack[++top] = alto;
            }
        }

        System.out.println("\nEl Array ordenado es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    
}
