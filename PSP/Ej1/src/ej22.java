import java.util.ArrayList;
import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        boolean eszero = false;
        do {
            System.out.print("Dime el nombre: ");
            nombre = sc.nextLine();
            if(nombre.equals("0")) {
                eszero = true;
            }else{
                nombres.add(nombre);
            }

        }while (!eszero);
        for(String nombres1 : nombres) {
            System.out.println(nombres1);
        }
    }
}
