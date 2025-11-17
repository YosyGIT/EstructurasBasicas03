package practica18;
import java.util.*;
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        String nif, nifTransormado = " ";
        int numero;
        boolean correcto = false;

        System.out.print("Introduce tu NIF: ");
        nif = sc.nextLine();

        if (nif.matches("[XYZ0-9][0-9]{7}[A-Z]")){
            if (nif.charAt(0) == 'X'){
                nifTransormado = "0" + nif.substring(1);
            }else if (nif.charAt(0) == 'Y'){
                nifTransormado = "1" + nif.substring(1);
            } else if (nif.charAt(0) == 'Z') {
                nifTransormado = "2" + nif.substring(1);
            }else {
                nifTransormado = nif;
            }
            correcto = true;
        }else {
            System.out.println("NIF invalido");
        }

        if (correcto){
            numero = (Integer.parseInt(nifTransormado.substring(0,7)) % 23);
            System.out.println(numero);
        }
    }
}
