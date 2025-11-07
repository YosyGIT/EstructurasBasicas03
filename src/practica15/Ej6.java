package practica15;

public class Ej6 {
    public static void main(String[] args) {
        byte[] numero1 = new byte[40], numero2 = new byte[40], numero3 = new byte[40];
        byte x = 39, llevar, suma;

        for (int i = 0; i < numero1.length; i++) {
            numero1[i] = (byte) (Math.random() * 10);
            numero2[i] = (byte) (Math.random() * 10);
        }

        for (int n1: numero1){
            System.out.print("    ");
            System.out.print("\t" + n1);
        }
        System.out.println("\n" + "+");
        for (int n2: numero2){
            System.out.print("    ");
            System.out.print("\t" + n2);
        }

        for (int i = 39; i >= 0; i--) {
            if ((byte)(numero2[i] + numero1[i]) >= 10 && i > 0) {
                numero3[i] = (byte)((numero2[i] + numero1[x]) % 10);
                numero1[i-1] = (byte)(numero1[i-1] + 1);
            }else if ((byte)(numero2[i] + numero1[i]) >= 10 && i == 0){
                numero3[i] = (byte)(numero2[i] + numero1[i] + 1);
            }else {
                numero3[i] = (byte)(numero2[i] + numero1[i]);
            }
        }

        System.out.println("\n" + "-------------------------------------------------------------------------------------------------------------------------------------"
        + "-------------------------------------------------------------------------------------------------------------------------------------------------------------"
        + "-----------------------------------");
        for (int n3: numero3){
            System.out.print("    ");
            System.out.print("\t" + n3);
        }
    }
}
