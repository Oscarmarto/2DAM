package T1_Fichers;

import java.io.File;
import java.util.Scanner;

public class ej5  {
    public static <FiltroExtension> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del archivo");

        String strdirectorio2 = args[0];
        System.out.println();
        File directorio2 = new File(strdirectorio2);
        FiltroExtension filtro = new FiltroExtension();
        String[] listaArchivos2 = directorio2.list();
        for (int i = 0; i < listaArchivos2.length; i++) {
            System.out.println(
                    listaArchivos2[i]
            );
        }
    }
}
