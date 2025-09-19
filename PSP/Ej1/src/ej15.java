import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor del radio:");
        double radio = sc.nextDouble();

        double diametro = 2 * radio;
        double area = Math.PI * radio * radio;
        double volumen = ((double) 4 / 3) * Math.PI * Math.pow(radio, 3);

        System.out.println("Diámetro: " + String.format("%.2f", diametro));
        System.out.println("Área: " + String.format("%.2f", area));
        System.out.println("Volumen: " + String.format("%.2f", volumen));

    }
}
