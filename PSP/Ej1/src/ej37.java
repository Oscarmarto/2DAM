import java.util.Scanner;

public class ej37 {

    public static void calcularNivellISalari() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el teu nom: ");
        String nom = sc.nextLine();

        System.out.print("Introdueix els anys d'experiència com a desenvolupador: ");
        int anys = sc.nextInt();

        System.out.println("\nResultat per a " + nom + ":");

        if (anys < 1) {
            System.out.println("Desenvolupador Junior L1 – 15000-18000");
        } else if (anys >= 1 && anys <= 2) {
            System.out.println("Desenvolupador Junior L2 – 18000-22000");
        } else if (anys >= 3 && anys <= 5) {
            System.out.println("Desenvolupador Sènior L1 – 22000-28000");
        } else if (anys >= 6 && anys <= 8) {
            System.out.println("Desenvolupador Sènior L2 – 28000-36000");
        } else {
            System.out.println("Analista / Arquitecte. Salari a convenir en base a rol");
        }
    }

    public static void main(String[] args) {
        calcularNivellISalari();
    }
}
