import java.util.ArrayList;
import java.util.Scanner;

public class ej23 {
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
        int contador = 1;
        for(String nombres1 : nombres) {
            System.out.println(contador+". "+nombres1);
            contador++;
        }
    }
}
