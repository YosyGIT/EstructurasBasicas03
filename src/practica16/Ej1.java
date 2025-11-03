package practica16;
import java.util.*;
public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double[] array = new double[10];
        double precio;
        int posicion = 1;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor del " + (i + 1) + "er producto: ");
            precio = in.nextDouble();
            while(precio <= 0){
                System.out.print("ERROR: El precio debe ser mayor a 0. Introduce el valor del producto: ");
                precio = in.nextDouble();
            }
            array[i] = precio;
        }

        while(posicion <= 10 && posicion > 0){
            System.out.print("Que precio desea buscar (1-10): ");
            posicion = in.nextInt();
            System.out.println("Precio del articulo " + posicion + ": " + array[posicion - 1]);
        }
    }
}
