import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la temperatura a pasar");
        double temp = sc.nextDouble();
        double temp2 = temp * 1.8 + 32;
        System.out.println(temp+"ºC son "+String.format("%.2f", temp2)+"ºFarenheit");
    }

}
