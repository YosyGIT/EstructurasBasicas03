package practica19;
import java.util.*;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codigoPost;

        System.out.print("Introduce el codigo postal: ");
        codigoPost = sc.nextLine();

        System.out.println(codigoPost.matches("([0-4][1-9]|[5][0-2])[0-9]{3}")?"Codigo postal correcto":"Codigo postal incorrecto");
        System.out.println("##" + codigoPost);
    }
}
