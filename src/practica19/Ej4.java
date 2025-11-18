package practica19;
import java.util.*;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String matricula;

        System.out.print("Introduce la matrícula del vehículo: ");
        matricula = sc.nextLine();

        if (matricula.matches("[0-9]{4}[A-Z]{3}")){
            if (matricula.matches("[0-9]{4}[AEIOUQ]+")){
                System.out.println("Matrícula incorrecta");
            }else {
                System.out.println("Matrícula correcta");
            }
        }
    }
}
