import java.util.Scanner;
import java.util.Arrays;
public class PruebaCodigoEx {
    public static void main(String[] args) {
        String[] nombres = {"  juan ", "Ana", " pedro", "JORGE", "  Javier  ", "luis"};

        for(String n: nombres){
            if(n.trim().matches("[jJ][A-Za-z]*")){
                System.out.println(n.trim().toUpperCase());
            }
        }
    }

    public static void main2(String[] args) {
        String[] datos = {"Juan:8", "  Ana : 10 ", "Pedro:4", "  Luis : 3  "};
        String[] nombres = new String[datos.length];
        int [] notas = new int [datos.length];

        for(int i = 0; i < datos.length; i++){
            nombres[i] = datos[i].trim().substring(0,datos[i].indexOf(":"));
            notas[i] = Integer.parseInt(datos[i].trim().substring(datos[i].indexOf(",") + 1, datos[i].length()));
            if (notas[i] >= 5) {
                System.out.println(nombres[i] + " ha APROBADO con un " + notas[i]);
            }else {
                System.out.println(nombres[i] + " ha SUSPENDIDO con un " + notas[i]);
            }
        }
    }
}
