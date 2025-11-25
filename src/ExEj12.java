import java.util.Arrays;
import java.util.Scanner;
public class ExEj12 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        String[] textos = new String[100];
        String texto = "";
        int tamano = 0, largoTexto;
        int contLetra = 0, contPeque = 1000, contLargo= 0;

        while(!texto.equalsIgnoreCase("salir")) {
            System.out.println("Introduce un texto");
            texto = in.nextLine();
            tamano++;
            textos[tamano - 1] = texto;
        }
        textos = Arrays.copyOf(textos, tamano);

        for(String t: textos){
            largoTexto = t.trim().length();
            if(t.matches(".*[Ññ].*")){
                for (int i = 0; i < t.length(); i++) {
                    if (t.matches(".*[Ññ].*")){
                        contLetra++;
                    }
                }
            }
            if (!t.equalsIgnoreCase("salir")) {
                if(contLargo < largoTexto){
                    contLargo = largoTexto;
                }
                if(contPeque > largoTexto){
                    contPeque = largoTexto;
                }
            }
        }

        System.out.println("Se repite la Ñ: " + contLetra + " veces");
        System.out.println("La frase mas larga tiene: " + contLargo + " letras");
        System.out.println("La frase mas pequeña tiene: " + contPeque + " letras");
    }
}