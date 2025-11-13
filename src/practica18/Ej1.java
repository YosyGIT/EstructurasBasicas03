package practica18;
import java.util.*;
public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String texto;

        System.out.print("Escribe un texto: ");
        texto = in.nextLine();

        for (int i = 0; i < texto.length(); i++){
            System.out.println(texto.charAt(i));
        }
    }
}
