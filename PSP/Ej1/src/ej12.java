import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suspesos = 0;
        int aprovats = 0;
        int notables = 0;
        int excelents = 0;
        int matricula = 0;

        for (int i = 1; i <= 10; i++) {
            double nota;
            do {
                System.out.print("Introdueix la nota " + i + " (0-10): ");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota invàlida. Torna-ho a provar.");
                }
            } while (nota < 0 || nota > 10);

            if (nota < 5) {
                suspesos++;
            } else if (nota < 7) {
                aprovats++;
            } else if (nota < 9) {
                notables++;
            } else if (nota < 10) {
                excelents++;
            } else {
                matricula++;
            }
        }

        System.out.println("\nResultats:");
        System.out.println("Suspesos: " + suspesos);
        System.out.println("Aprovats: " + aprovats);
        System.out.println("Notables: " + notables);
        System.out.println("Excel·lents: " + excelents);
        System.out.println("Matrícula: " + matricula);
    }
}

