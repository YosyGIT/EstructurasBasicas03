package practica19;
import java.util.*;
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palabras;
        String texto;

        System.out.println("--Introduce un texto, puede ser lo largo que quieras-- ");
        texto = sc.nextLine();
        palabras = texto.trim().split("\\s+");

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Caracteres introducidos: " + texto.length());
        System.out.println("Palabras introducidas: " + palabras.length);
    }
}
