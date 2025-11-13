package practica18;
import java.util.*;
public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String texto;
        byte incremento = 0;

        System.out.print("-Introduce el texto: ");
        texto = in.nextLine();

        for (int l = 0; l < texto.length(); l++){
            for (int j = 0; j <= incremento; j++){
                System.out.print(texto.charAt(j));
            }
            System.out.println();
            if (texto.length() > incremento){
                incremento++;
            }
        }
    }
}
