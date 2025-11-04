package practica16;
import java.util.*;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array1 = new int[10], array2 = new int[10];
        int coincidencia = 0;
        boolean encontrado;

        for (int l = 0; l < array1.length; l++) {
            System.out.print("Introduce el " + (l + 1) + "º numero: ");
            array1[l] = sc.nextInt();
        }
        System.out.println("------------------------------");

        for (int k = 0; k < array2.length; k++) {
            System.out.print("Introduce el " + (k + 1) + "º numero: ");
            array2[k] = sc.nextInt();
        }
        System.out.println("------------------------------");

        //Buscamos si la coincidencia entre los arrays es de 10 numeros
        for (int i = 0; i < array1.length; i++) {
            encontrado = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && encontrado == false) {
                    array2[j] = -1;
                    coincidencia++;
                    encontrado = true;
                }
            }
        }

        System.out.println("Coincidencia: " + coincidencia);
        if (coincidencia == 10) {
            System.out.println("Coincidencias encontradas");
        }
    }
}
