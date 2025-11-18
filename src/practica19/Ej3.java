package practica19;
import java.util.*;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tel;

        System.out.print("Introduce el número telefonico: ");
        tel = sc.nextLine();

        if (tel.matches("([6789][0-9]{8}|[6789][0-9]{2}[0-9]{3}[0-9]{3})")){
            System.out.println("Telefono válido");
        }else {
            System.out.println("Telefono invalido");
        }
    }
}
