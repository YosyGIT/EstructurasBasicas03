package practica19;
import java.util.*;
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario;

        System.out.print("Introduce un nombre de usuario: ");
        usuario = sc.nextLine();

        while (!usuario.matches("[A-ZÑ][A-Za-zÑñ_0-9]+")){
            System.out.println("ERROR:: El nombre de usuario debe empezar por mayuscula y solo se permiten letras, guion bajo y numeros");
            System.out.print("Introduce un nombre de usuario de nuevo: ");
            usuario = sc.nextLine();
        }

        if (usuario.matches("[A-ZÑ][A-Za-zÑñ_0-9]+")){
            System.out.println("Bienvenido " + usuario);
        }
    }
}
