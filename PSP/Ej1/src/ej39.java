import java.util.Scanner;

public class ej39 {


    public static boolean esPrimer(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void mostrarInterval() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número de l'interval: ");
        int inici = sc.nextInt();

        System.out.print("Introdueix el segon número de l'interval: ");
        int fi = sc.nextInt();

        long tempsInici = System.currentTimeMillis(); // inicio del cronometro

        System.out.println("\nNúmeros entre " + inici + " i " + fi + ":");
        for (int i = inici; i <= fi; i++) {
            if (esPrimer(i)) {
                System.out.println(i + " → es primo");
            } else {
                System.out.println(i + " → no es primo");
            }
        }

        long tempsFinal = System.currentTimeMillis(); // Fin cronometro
        long tempsConsum = tempsFinal - tempsInici;

        System.out.println("--- Fi del llistat ---");
        System.out.println("Se ha tardat un total de " + tempsConsum + " ms");
    }

    public static void main(String[] args) {
        mostrarInterval();
    }
}
