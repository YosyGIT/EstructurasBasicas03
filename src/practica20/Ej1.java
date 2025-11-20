package practica20;
import java.util.*;
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palabras = new String[10];
        String palabra;

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Introduce la " + (i+1) + " palabra: ");
            palabra = sc.nextLine();
            palabras[i] = palabra.toLowerCase();
        }

        Arrays.sort(palabras);
        System.out.println("La palabra es: " + Arrays.toString(palabras));
    }
}
