package practica18;
import java.util.*;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String texto;

        System.out.print("Introduce el codigo de serie: ");
        texto = sc.nextLine();

        if (texto.matches("([SVX][0-9]{2}.[A-WYZa-wyzÑñ])|[SVX][0-9]{2}.X.")) {
            System.out.println("El codigo de serie: " + texto + " es correcto");
        }else {
            System.out.println("El codigo de serie: " + texto + " no es correcto");
        }
    }
}
