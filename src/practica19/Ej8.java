package practica19;
import java.util.*;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String NOMBRE = "\\s*[A-Za-zÑñ\\s]+\\s*";
        final String APELLIDOS = "\\s*[A-Za-zÑñ\\s]+\\s*";
        final String EDAD = "\\s*[0-9]{1,3}\\s*";

        String csv;
        String nombre, apellido, edad;

        System.out.println("nombre,apellidos,edad");
        System.out.print("Introduce los datos en el formato que se indica: ");
        csv = sc.nextLine();

        if (csv.matches(NOMBRE + "[,]" + APELLIDOS + "[,]" + EDAD)) {
            nombre = csv.substring(0, csv.indexOf(","));
            apellido = csv.substring(csv.indexOf(",") + 1,csv.lastIndexOf(","));
            edad = csv.substring(csv.lastIndexOf(",") + 1);

            System.out.println("NOMBRE: " + nombre.trim() + "\n" +
                    "APELLIDO: " + apellido.trim() + "\n" +
                    "EDAD: " + edad.trim() + "\n");
        } else{
            if (csv.matches(NOMBRE + "[,]" + EDAD)) System.out.println("Falta de introducir un campo de texto (nombre o apellidos).");
            if (csv.matches(NOMBRE + "[,]" + APELLIDOS)) System.out.println("Falta de introducir la edad.");
            if (csv.matches(NOMBRE + "[^,]" + APELLIDOS + "[^,]" + EDAD)) System.out.println("El delimitador no es la coma.");
            if (csv.matches(NOMBRE + "[,]" + APELLIDOS + "[,][0-9]*")) System.out.println("La edad no puede tener más de tres cifras.");
            }

        while(!csv.equalsIgnoreCase("salir")){
            System.out.println("--Si deseas salir, escribelo--");
            System.out.print("Introduce los datos en el mismo formato que antes: ");
            csv = sc.nextLine();

            if (csv.matches(NOMBRE + "[,]" + APELLIDOS + "[,]" + EDAD)) {
                nombre = csv.substring(0, csv.indexOf(","));
                apellido = csv.substring(csv.indexOf(",") + 1,csv.lastIndexOf(","));
                edad = csv.substring(csv.lastIndexOf(",") + 1);

                System.out.println("NOMBRE: " + nombre.trim() + "\n" +
                        "APELLIDO: " + apellido.trim() + "\n" +
                        "EDAD: " + edad.trim() + "\n");
            } else{
                if (csv.matches(NOMBRE + "[,]" + EDAD)) System.out.println("Falta de introducir un campo de texto (nombre o apellidos).");
                if (csv.matches(NOMBRE + "[,]" + APELLIDOS)) System.out.println("Falta de introducir la edad.");
                if (csv.matches(NOMBRE + "[^,]" + APELLIDOS + "[^,]" + EDAD)) System.out.println("El delimitador no es la coma.");
                if (csv.matches(NOMBRE + "[,]" + APELLIDOS + "[,][0-9]*")) System.out.println("La edad no puede tener más de tres cifras.");
            }

        }
    }
}

