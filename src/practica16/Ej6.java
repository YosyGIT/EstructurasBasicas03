package practica16;
import java.util.*;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array1 = new int[10], array2 = new int[10];
        int coincidencia = 0;

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Introduce el " + (i + 1) + "º numero: ");
            array1[i] = sc.nextInt();
        }
        System.out.println("------------------------------");

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Introduce el " + (i + 1) + "º numero: ");
            array2[i] = sc.nextInt();
        }
        System.out.println("------------------------------");

        //Buscamos si la coincidencia entre los arrays es de 10 numeros
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    coincidencia++;
                }
            }
        }

        System.out.println("Coincidencia: " + coincidencia);
        if (coincidencia == 10) {
            System.out.println("Coincidencias encontradas");
        }
    }
}
