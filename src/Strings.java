import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;
        char[] array;

        System.out.print("Introduce texto: ");
        texto = sc.nextLine();
        array = texto.toCharArray(); //Trasformamos el String en un Array

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        String texto2;
        System.out.println("Introduce el texto 2: ");
        texto2 = sc.nextLine();

        for (int i = 0; i < texto2.length(); i++){
            System.out.println(texto2.charAt(i)); //Mostrar letra por letra el String
        }

    }
}
