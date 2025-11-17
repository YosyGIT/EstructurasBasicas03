package practica18;
import java.util.*;
public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] array;
        String texto;
        byte repeticiones = 1, posicionCaracter = 0;
        char caracter;

        System.out.print("-Introduce el texto: ");
        texto = in.nextLine();
        texto = texto.toLowerCase();
        array = new char[texto.length()];
        array = texto.toCharArray();
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        caracter = array[posicionCaracter];

        for (int i = 1; i < array.length; i++){


            if (array[i] == caracter){
                repeticiones++;
            } else if (caracter != array[i]) {
                posicionCaracter = (byte) i;
                System.out.println(caracter + " " + repeticiones + " veces");
                caracter = array[posicionCaracter];
                repeticiones = 1;
            }
        }
        System.out.println(caracter + " " + repeticiones + " veces");
    }
}
