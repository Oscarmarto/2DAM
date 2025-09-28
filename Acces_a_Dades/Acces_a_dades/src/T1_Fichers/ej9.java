package T1_Fichers;
import java.util.Date;

import java.io.File;
import java.util.Scanner;

public class ej9 {
    static Scanner sc =new Scanner(System.in);
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

    //Crear una carpeta en el directorio local
    public static void creaCarpeta(File algo){
        File directorio = new File(algo,"Nuevo_Directorio");
        if(!directorio.exists()){
            directorio.mkdir();
            System.out.println("El directorio se ha creado");
        }else{
            System.out.println("El directorio ya existe");
        }
    }

    //Crear un fichero en el directorio local
    public static void creaFitxer(File algo) {
        try {
            File fichero = new File(algo, "Nuevo_Fichero.txt");
            if (!fichero.exists()) {
                fichero.createNewFile();
                System.out.println("El fichero se ha creado");
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Eliminar una carpeta en el directorio local
    public static void eliminaCarpeta(File algo){
        File directorio = new File(algo,"Nuevo_Directorio");
        if(directorio.exists()){
            directorio.delete();
            System.out.println("El directorio se ha eliminado");
        }else{
            System.out.println("El directorio ya no existe");
        }
    }

    //Eliminar un fichero en el directorio local
    public static void eliminaFitxer(File algo) {
            File fichero = new File(algo, "Nuevo_Fichero.txt");
            if (fichero.exists()) {
                fichero.delete();
                System.out.println("El fichero se ha eliminado");
            } else {
                System.out.println("El fichero ya no existe.");
            }
    }

    public static void renomenarCarpeta(File algo) {
        File directorio = new File(algo,"Nuevo_Directorio");
        File nuevodirectorio = new File(algo,"Directorio_con_nombre_2");
        if(directorio.exists()){
            directorio.renameTo(nuevodirectorio);
            System.out.println("Se ha cambiado el nombre del directorio");
        }else{
            System.out.println("El directorio no existe, entonces no se ha podico cambiar ningun nombre");
        }
    }

    public static void renomenarFitxer(File algo) {
        File fichero = new File(algo,"Nuevo_Fichero.txt");
        File nuevofichero = new File(algo,"Fichero_con_nombre_2.txt");
        if(fichero.exists()){
            fichero.renameTo(nuevofichero);
            System.out.println("Se ha cambiado el nombre del fichero");
        }else{
            System.out.println("El fichero no existe, entonces no se ha podico cambiar ningun nombre");
        }
    }


    public static void main(String[] args) {
        String directorio = args[0];
        File directorio2 = new File(directorio);
        getInformacio(directorio2);
    }
}
