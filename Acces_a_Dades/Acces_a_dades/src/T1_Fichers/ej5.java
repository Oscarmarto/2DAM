package T1_Fichers;

import java.io.File;
import java.util.Scanner;
import java.io.FilenameFilter;

public class ej5  {
    public static void main(String[] args) {
        String strdirectorio2 = args[0];
        File directorio2 = new File(strdirectorio2);
        FiltroExtension filtro = new FiltroExtension(args [1]);
        String[] listaArchivos2 = directorio2.list(filtro);
        for (int i = 0; i < listaArchivos2.length; i++) {
            System.out.println(
                    listaArchivos2[i]
            );
        }
    }
}
