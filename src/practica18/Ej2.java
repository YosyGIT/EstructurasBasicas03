package practica18;
import java.util.*;
public class Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String texto;
        int clave;

        System.out.print("-Introduce un texto: ");
        texto = in.nextLine();

        System.out.print("-Introduce una clave: ");
        clave = in.nextInt();

        for (int i = 0; i < texto.length(); i++){
            System.out.print((char) (texto.charAt(i) + clave));
        }
    }
}
