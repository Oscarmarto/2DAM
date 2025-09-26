package T1_Fichers;
import java.util.Date;

import java.io.File;

public class ej9 {
    public static void getInformacio(File algo) {
        //Para ver la ultima modificación del archivo o directorio
        long ultimaModificacion = algo.lastModified();
        Date fechaModificacion = new Date(ultimaModificacion);

        //Condicional para ver si es un directorio
        if (algo.isDirectory()) {
            System.out.println("Es un directorio");
            System.out.println("Nombre del documento: " + algo.getName());

            //Es un directorio oculto o no
            if (algo.isHidden()) {
                System.out.println("Es un directorio oculto");
            }else{
                System.out.println("No es un directorio oculto");
            }

            //Calcular la cantidad de elementos en el Directorio
            String[] lista = algo.list();
            if(lista!=null){
                System.out.println("Cantidad de elementos: " + lista.length);
            }else{
                System.out.println("No existen elementos");
            }

            long total = algo.getTotalSpace(); //Espacio total
            long libre = algo.getFreeSpace(); //Espacio libre
            long disponible = algo.getUsableSpace(); //Espacio disponible

            System.out.println("Total: " + (total / (1024 * 1024 * 1024)) + "GB. Libre: " + (libre / (1024 * 1024 * 1024)) + "GB. Disponible: " + (disponible / (1024 * 1024 * 1024)) + "GB.");

        } else {//Else para decir que es archivo
            System.out.println("Es un archivo");
            System.out.println("Nombre del archivo: " + algo.getName());

            //Es un archivo oculto o no
            if (algo.isHidden()) {
                System.out.println("Es un archivo oculto");
            }else{
                System.out.println("No es un archivo oculto");
            }
            System.out.println("La cantitad de bytes del fichero es de "+algo.length());
        }
        System.out.println("Ruta absoluta: " + algo.getAbsolutePath());
        System.out.println("Ultima modificacion: " + fechaModificacion);

    }

    public static void main(String[] args) {
        String directorio = args[0];
        File directorio2 = new File(directorio);
        getInformacio(directorio2);
    }
}
