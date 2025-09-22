import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        Scanner sc = new Scanner(System.in);
        String nombre;
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dime el nombre " + (i+1));
            nombre = sc.nextLine();
            nombres[i] = nombre;
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
