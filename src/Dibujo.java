import java.util.Scanner;
public class Dibujo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] array = new char[15][70];
        int opcion = 1, x = 0, y = 0, nuevaPosicion = 0;
        boolean pinto = false, borro = false;
        char auxCaracter;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '·';
            }
        }

        while (opcion != 0) {
            System.out.println("0) Salir");
            System.out.println("1) Bajar lápiz");
            System.out.println("2) Subir lápiz");
            System.out.println("3) Bajar goma");
            System.out.println("4) Subir goma");
            System.out.println("5) Mover arriba");
            System.out.println("6) Mover abajo");
            System.out.println("7) Mover izquierda");
            System.out.println("8) Mover derecha");
            System.out.println("9) Mostrar tablero");
            System.out.print("->");
            opcion = sc.nextInt();

            while (opcion < 0 || opcion > 9){
                System.out.println("Opcion invalida, elija una opcion: ");
                opcion = sc.nextInt();
            }

            switch (opcion) {
                case 1:
                    if (borro){
                        borro = false;
                    }
                    pinto = true;
                    array[x][y] = (char)(0x2588);
                    break;
                case 2:
                    pinto = false;
                    break;
                case 3:
                    if (pinto) {
                        pinto = false;
                    }
                    borro = true;
                    array[x][y] = '·';
                    break;
                case 4:
                    borro = false;
                    break;
                case 5:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (x == 0) {
                        System.err.println("LIMITE ENCONTRADO: No se puede subir en el tablero.");
                    } else if(pinto){
                        x--;
                        array[x][y] = (char)(0x2588);
                    } else if (borro) {
                        x--;
                        array[x][y] = '·';
                    } else {
                        x--;

                    }
                    System.out.println(nuevaPosicion);
                    break;
                case 6:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (x == 14) {
                        System.err.println("LIMITE ENCONTRADO: No se puede bajar en el tablero.");
                    } else if(pinto){
                        x++;
                        array[x][y] = (char)(0x2588);
                    } else if (borro) {
                        x++;
                        array[x][y] = '·';
                    } else {
                        x++;
                    }
                    System.out.println(nuevaPosicion);
                    break;
                case 7:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (y == 0) {
                        System.err.println("LIMITE ENCONTRADO: No se puede mover a la izquierda en el tablero.");
                    } else if(pinto){
                        y--;
                        array[x][y] = (char)(0x2588);
                    } else if (borro) {
                        y--;
                        array[x][y] = '·';
                    } else {
                        y--;

                    }
                    System.out.println(nuevaPosicion);
                    break;
                case 8:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (y == 69) {
                        System.err.println("LIMITE ENCONTRADO: No se puede mover a la derecha en el tablero.");
                    } else if(pinto){
                        y++;
                        array[x][y] = (char)(0x2588);
                    } else if (borro) {
                        y++;
                        array[x][y] = '·';
                    } else {
                        y++;
                    }
                    System.out.println(nuevaPosicion);
                    break;
                case 9:
                    for (char[] fila: array){
                        for (char caracter: fila){
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
            }

        }

    }
}
