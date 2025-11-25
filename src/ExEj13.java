import java.util.Scanner;
import java.util.Locale;
public class ExEj13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String[] nombres = new String[5];
        double[] medias = new double[5];
        double[][] notas = new double[5][];
        notas[0] = new double[14];
        notas[1] = new double[9];
        notas[2] = new double[12];
        notas[3] = new double[7];
        notas[4] = new double[17];

        int contAlumno = 1, contNota = 1;


        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre del alumno " + contAlumno + ": ");
            nombres[i] = sc.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Introduce la nota " + contNota + ": ");
                notas[i][j] = sc.nextDouble();
                medias[i] += notas[i][j];
                contNota++;
            }
            contAlumno++;
            medias[i] /= contNota;
            contNota = 1;
        }

        for (int k = 0; k < nombres.length; k++) {
            System.out.println("El alumno " + nombres[k] + " tiene de media: " + medias[k]);
        }
    }
}
