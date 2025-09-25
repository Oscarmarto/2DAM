import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.io.FilenameFilter;

public class Ej1 {
    public static void main(String[] args) {
        File algo = new File("Algo.txt");
        /*  Ejemplo1
        System.out.println("Nombre del archivo: "+algo.getName());
        System.out.println("Ruta: " + algo.getPath());
        System.out.println("Ruta absoluta:"+algo.getAbsolutePath());
        System.out.println("Se puede leer: "+ algo.canRead());
        System.out.println("Se puede escribir: "+ algo.canWrite());
        System.out.println("Tamaño del archivo: "+algo.length());
         */

        //Ejemplo 2: listar contenido directorio
//        File directorio = new File(".");
//        String[] listaArchivos = directorio.list();
//        System.out.println("Contenidos directorio:" + directorio.getName());

        //For Simple
//        for(int i = 0; i < listaArchivos.length; i++){
//            System.out.println(listaArchivos[i]);
//        }
        //ForEach
//        for(String archivo: listaArchivos){
//            System.out.println(archivo);
//        }

        //Ejemplo 3: listar contenido directorio filtrando por extension
//        String strdirectorio2 = args[0];
//        System.out.println();
//        File directorio2 = new File(strdirectorio2);
//        T1_Fichers.ej4.FiltroExtension filtro = new T1_Fichers.ej4.FiltroExtension(".txt");
//        String[] listaArchivos2 = directorio2.list(filtro);
//        for (int i = 0; i < listaArchivos2.length; i++) {
//            System.out.println(
//                    listaArchivos2[i]
//            );
//        }

        //Ejemplo 4: Crear fichero
        File fichero = new File("Fichero.txt");
        try{
            fichero.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}