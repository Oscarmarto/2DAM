import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el número del DNI (sense lletra): ");
        int dniNum = scanner.nextInt();

        // Taula de lletres segons el residu
        char[] lletres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

        // Calculem la posició
        int residu = dniNum % 23;
        char lletra = lletres[residu];

        System.out.println("El DNI complet és: " + dniNum + lletra);
    }
}

