package practica19;
import java.util.*;
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correo;

        System.out.print("Introduce el Correo: ");
        correo = sc.nextLine();
        correo = correo.toLowerCase();

        if (correo.matches("[\\w](\\w|\\.)+@[\\w](\\w|\\.)+(\\.com|\\.es|\\.net)")){
            System.out.println("El correo [" + correo + "] es valido");
        }else {
            System.out.println("El correo [" + correo + "] no cumple con las condiciones para ser valido");
        }
    }
}
