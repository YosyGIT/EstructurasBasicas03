package practica18;
import java.util.*;
public class Ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte[] array;
        String texto;
        byte contadorTam = 0, i = 0;
        long clave, tamano;

        System.out.print("-Introduce el texto: ");
        texto = in.nextLine();

        System.out.print("-Introduce la clave: ");
        clave = in.nextLong();
        tamano = clave;

        while(tamano > 0){
            tamano /= 10;
            contadorTam++;
        }
        array = new byte[contadorTam];

        while(clave > 0){
            array[i] = (byte) (clave % 10);
            clave /= 10;
            i++;
        }
        System.out.println(Arrays.toString(array));
        i = (byte) (contadorTam - 1);

        System.out.print("## ");
        for (int j = 0; j < texto.length(); j++){
            System.out.print((char)(texto.charAt(j) + array[i]));
            if (i > 0){
                i--;
            } else {
                i = (byte) (contadorTam - 1);
            }
        }

    }
}
