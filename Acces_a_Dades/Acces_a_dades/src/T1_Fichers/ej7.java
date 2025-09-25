package T1_Fichers;

import java.io.File;

public class ej7 {
    public static void main(String[] args) {
        //Argumento de directorio
        String strdirectorio2 = args[0];
        File directorio2 = new File(strdirectorio2);

        //Para pedir solo los ficheros con el parametro que queramos
        if (args.length > 1) {
            int argumentos = args.length;
            for(int i = 1; i < argumentos; i++){
                FiltroExtension filtro = new FiltroExtension(args[i]);
                String[] listaArchivos2 = directorio2.list(filtro);
                for (int j = 0; j < listaArchivos2.length; j++) {
                    System.out.println(
                            listaArchivos2[j]
                    );
                }
            }

        } else {// Nos da todos los archivos al no pasarle parametro
            String[] listaArchivos1 = directorio2.list();
            for (int i = 0; i < listaArchivos1.length; i++) {
                System.out.println(listaArchivos1[i]);
            }
        }
    }
}
