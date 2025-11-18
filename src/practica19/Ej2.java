package practica19;
import java.util.*;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass;
        boolean mayus = false, minus = false, numero = false, simbolo = false;

        System.out.print("Introduce la contraseña: ");
        pass = sc.nextLine();

        if (pass.matches("[A-Za-zÑn0-9[^A-ZÑa-zñ0-9]]{10}([A-Za-zÑn0-9[^A-ZÑa-zñ0-9]])*")){
            if (pass.matches(".*[A-ZÑ].*")){
                mayus = true;
                if (pass.matches(".*[a-zñ].*")){
                    minus = true;
                    if (pass.matches(".*[0-9].*")) {
                        numero = true;
                        if (pass.matches(".*[^A-ZÑa-zñ0-9].*")) {
                            simbolo = true;
                        }
                    }
                }
            }
        }


        if (mayus && minus && numero && simbolo){
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
