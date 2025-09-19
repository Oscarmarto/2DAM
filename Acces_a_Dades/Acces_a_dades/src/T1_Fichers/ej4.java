package T1_Fichers;

import java.io.File;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del archivo");
        String archivo = sc.nextLine();
        File algo = new File(archivo);
        System.out.println("Has escrito " + archivo);

        if(algo.exists()){
            System.out.println("El fichero existe");
        }else{
            System.out.println("El fichero no existe");
        }
        System.out.println("Nombre del archivo: "+algo.getName());
        System.out.println("Ruta: " + algo.getPath());
        System.out.println("Ruta absoluta:"+algo.getAbsolutePath());
        System.out.println("Se puede leer: "+ algo.canRead());
        System.out.println("Se puede escribir: "+ algo.canWrite());
        System.out.println("Tamaño del archivo: "+algo.length());
    }
}
