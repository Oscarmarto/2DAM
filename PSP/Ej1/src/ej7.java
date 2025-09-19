import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {

        int suma = 0;
        int i = 0;
        while(i<5){
            Scanner num = new Scanner(System.in);
            System.out.print("Numero "+(i+1)+": ");
            int num1 = num.nextInt();
            suma = suma + num1;
            i++;
        }
        System.out.println("El total de la suma es: "+suma);
    }
}
