package practica15;
import java.util.*;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array;
        int[] arrayRecolector;
        int calcularTamano, tamano = 1, numero, posicion = 0;

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
            System.out.println(calcularTamano);
        }
        arrayRecolector = new int[tamano];
        array = new int[tamano];

        while(numero > 0){
            numero %= 10;
            arrayRecolector[posicion] = numero;
            posicion++;
        }

        for (int i = 0; i < arrayRecolector.length; i++) {
            System.out.println(arrayRecolector[i]);
        }
    }
}
