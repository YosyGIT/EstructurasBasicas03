package practica20;
import java.util.*;
public class Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String texto, textoNormal;
        boolean correcto = false;

        System.out.print("Introduce una frase: ");
        texto = in.nextLine();
        textoNormal = texto;
        texto = texto.trim().toLowerCase();

        texto = texto.replace('á', 'a');
        texto = texto.replace('é', 'e');
        texto = texto.replace('í', 'i');
        texto = texto.replace('ó', 'o');
        texto = texto.replace('ú', 'u');
        texto = texto.replace('ü', 'u');
        texto = texto.replace(",", "");
        texto = texto.replace(" ", "");


        for (int i = 0, j = texto.length() - 1; i <= j; i++, j--) {
            if (texto.charAt(i) == texto.charAt(j)) {
                correcto = true;
            }else  {
                correcto = false;
                break;
            }
        }

        System.out.println();
        System.out.println("-- " + textoNormal);
        System.out.println("-- " + texto);
        System.out.println((correcto?"es":"no es") + " un palindromo");
    }
}
