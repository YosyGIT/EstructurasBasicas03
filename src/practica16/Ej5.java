package practica16;
import java.util.*;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
            for (int j = i - 1; j >= 0; j--) {
                if (numeros[j] == numeros[i]) {
                    System.out.println("El numero ya se encuentra en el array");
                }
            }
        }
    }
}
