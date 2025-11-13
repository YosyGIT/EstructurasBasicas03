package practica18;
import java.util.*;
public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] array;
        String texto;
        byte repeticiones = 0;

        System.out.println("-Introduce el texto: ");
        texto = in.nextLine();
        texto = texto.toLowerCase();
        array = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++){
            array[i] = texto.charAt(i);
            for (int z = (texto.length() - 1); z == i; z--){
                if (texto.charAt(i)==texto.charAt(z)){
                    repeticiones++;
                }
            }
            if (repeticiones != 1){
                System.out.println(texto.charAt(i) + repeticiones + " veces");
            } else {
                System.out.println(texto.charAt(i) + repeticiones + " vez");
            }
            repeticiones = 0;
        }
    }
}
