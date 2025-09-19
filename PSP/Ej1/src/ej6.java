import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {

        int suma = 0;
        for(int i = 0; i < 5 ; i++) {
            Scanner num = new Scanner(System.in);
            System.out.print("Numero "+(i+1)+": ");
            int num1 = num.nextInt();
            suma = suma + num1;
        }
        System.out.println("El total de la suma es: "+suma);
    }
}
