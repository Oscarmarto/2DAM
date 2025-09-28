import java.util.Scanner;

public class ej36 {

    public static int processarNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int suma = 0;

        // Pido los numeros y los voy acumulando en el contador de la suma y los meto en el array
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introdueix el número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            suma += nums[i];
        }

        // El for se hace al reves para sacar los numero de el ultimo al primero
        System.out.println("\nNúmeros en ordre invers:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        return suma;
    }

    public static void main(String[] args) {
        int resultat = processarNumeros();
        System.out.println("\nLa suma dels números és: " + resultat);
    }
}
