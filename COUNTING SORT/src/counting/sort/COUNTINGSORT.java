package counting.sort;
import java.util.Scanner;
public class COUNTINGSORT {
    public static void main(String[] args) {
        // COUNTING SORT
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
        
        int MAX = Array[0];
        for (int i = 0; i < N; i++) {
            if (Array[i] > MAX) {
                MAX = Array[i];
            }
        }
        
        int ArrNuevo[] = new int[N];
        int cont[] = new int[MAX + 1];
        
        for (int i = 0; i <= MAX; i++) {
            cont[i] = 0;
        }
        
        for (int i = 0; i < N; i++) {
            int num = Array[i];
            cont[num]++;
        }
        
        for (int i = 1; i <= MAX; i++) {
            cont[i] += cont[i - 1];
        }
        
        for (int i = 0; i < N; i++) {
            int num = Array[i];
            int indice = cont[num];
            ArrNuevo[indice - 1] = num;
            cont[num]--;
        }
        
        for (int i = 0; i < N; i++) {
            Array[i] = ArrNuevo[i];
        }
        
        System.out.println("\nEl Array ordenado es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    
}
