import java.util.*;
public class ExpRegu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String referir;

        System.out.print("Como quieres que me dirija a ti? (Amigo/Amiga): ");
        referir = sc.nextLine();

        System.out.println(referir.matches("Amigo") || referir.matches("Amiga"));
        System.out.println(referir.matches("Amig[ao]")?"Correcto":"Incorreto");

        System.out.println("-----------------------------");

        //Lo mismo con 5 numeros
        String numeros;

        System.out.print("Introduce 5 numeros: ");
        numeros = sc.nextLine();

        System.out.println(numeros.matches("[0-9][0-9][0-9][0-9][0-9]")?"Correcto":"Incorrecto");

        System.out.println("-----------------------------");

        //Validar un codigo postal
        String codigoPost;

        System.out.print("Introduce el codigo postal: ");
        codigoPost = sc.nextLine();

        System.out.println(codigoPost.matches("([0-4][1-9]|[5][0-2])[0-9][0-9][0-9]")?"Codigo postal correcto":"Codigo postal incorrecto");
        System.out.println("##" + codigoPost);
    }
}
