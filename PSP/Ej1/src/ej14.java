import java.util.Scanner;

public class ej14   {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor del radio:");
        double radio = sc.nextDouble();

        double diametro = 2 * radio;
        double area = Math.PI * radio * radio;

        System.out.println("Diámetro: " + String.format("%.3f", diametro));
        System.out.println("Área: " + String.format("%.3f", area));

    }
}
