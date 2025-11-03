package practica16;
import java.util.*;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array = new int[25];
        int numero;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor del numero " + (i + 1) + ": ");
            numero = sc.nextInt();
            while(numero <= 0){
                System.out.print("ERROR: El numero debe ser mayor a 0. Introduce el valor del numero: ");
                numero = sc.nextInt();
            }
            array[i] = numero;
        }

        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            System.out.println(array[j]);
        }
    }
}
