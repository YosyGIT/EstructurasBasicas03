package practica15;
import java.sql.SQLOutput;
import java.util.*;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array = new int [20], arrayAux = new int[20];
        int numero, posicion;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 - 1 + 1) + 1);
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n" + "---------------------------------------");

        System.out.print("Introduce un numero para rotar el listado de números (1-19): ");
        numero = sc.nextInt();

        while (numero < 1 || numero > 19) {
            System.out.print("ERROR: fuera de rango, introduzca de nuevo: ");
            numero = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            posicion = (i + numero) % array.length;
            arrayAux[posicion] = array[i];
        }
        System.out.println("---------------------------------------");

        for (int j : arrayAux) {
            System.out.print(j + "\t");
        }
    }
}
