package practica15;
import java.util.*;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array;
        int calcularTamano, tamano = 0, numero;

        System.out.print("Introduce un numero entero: ");
        calcularTamano = sc.nextInt();

        while (calcularTamano <= 0){
            System.out.print("ERROR: No se puede realizar el programa con un numero negativo o cero. Introduce un numero entero: ");
            calcularTamano = sc.nextInt();
        }
        numero = calcularTamano;

        while(calcularTamano > 0){
            calcularTamano /= 10;
            tamano++;
        }
        tamano -= 1;
        array = new int[tamano];

        for (int i = 0; i < array.length; i++) {
            array[tamano] = numero % 10;
            tamano--;
            System.out.print(array[i] + "\t");
        }
    }
}
