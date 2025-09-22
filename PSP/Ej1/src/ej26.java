import java.util.Scanner;

public class ej26 {
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
            switch (Resultat(nota)) {
                case 1:
                    suspesos++;
                    break;
                case 2:
                    aprovats++;
                    break;
                case 3:
                    notables++;
                    break;
                case 4:
                    excelents++;
                    break;
                case 5:
                    matricula++;
                    break;
                default:
                    break;
            }

        }

        System.out.println("\nResultats:");
        System.out.println("Suspesos: " + suspesos);
        System.out.println("Aprovats: " + aprovats);
        System.out.println("Notables: " + notables);
        System.out.println("Excel·lents: " + excelents);
        System.out.println("Matrícula: " + matricula);
    }

    public static int Resultat(double nota) {
        if (nota < 5) {
            return 1;
        } else if (nota < 7) {
            return 2;
        } else if (nota < 9) {
            return 3;
        } else if (nota < 10) {
            return 4;
        } else {
            return 5;
        }
    }
}
