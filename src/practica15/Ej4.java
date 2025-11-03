package practica15;
import java.sql.SQLOutput;
import java.util.*;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array = new int [20];
        int numero, rotadorAux;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 - 1 + 1) + 1);
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n" + "---------------------------------------");

        System.out.println("Introduce un numero para rotar el listado de números (1-19): ");
        numero = sc.nextInt();

        while (numero < 1 || numero > 19) {
            System.out.println("ERROR: fuera de rango, introduzca de nuevo: ");
            numero = sc.nextInt();
        }

        for (int i = 0, j = (numero - 1); i < array.length; i++, j++) {
            rotadorAux = array[i];
            array[i] = j;
            System.out.println("***** j: " + j + " |array: " + array[i]);
        }
        System.out.println("\n" + "---------------------------------------");

        for (int j : array) {
            System.out.print(j + "\t");
        }
    }
}
