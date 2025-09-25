package T1_Fichers;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Ejemplo2 {

    public static void main(String[] args) {

//		//EJEMPLO1: leer txt caracter a caracter y mostrarlo
//		try {
//			FileReader fr = new FileReader("groucho.txt", StandardCharsets.UTF_8);
//			int valor=fr.read();
//            while(valor!=-1){
//                System.out.print((char)valor);
//                valor=fr.read();
//                Thread.sleep(100);
//            }
//            fr.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


        //EJEMPLO2: leer txt linea a linea y mostrarlo
//		try {
//			FileReader fr = new FileReader("groucho.txt", StandardCharsets.UTF_8);
//			BufferedReader br = new BufferedReader(fr);
//			String linea = br.readLine();
//            while(linea != null){
//                System.out.println(linea);
//                linea = br.readLine();
//                Thread.sleep(1000);
//            }
//            br.close();
//            fr.close();
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		//EJEMPLO3: escribir en fichero
        try {
            FileWriter fw = new FileWriter("groucho_2.txt", StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader("groucho.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println("Escribiendo linea... " + linea);
                Thread.sleep(100);
                bw.write(linea + "\n");
//                bw.newLine();
                linea = br.readLine();
            }
            bw.write("(Una Noche en la opera, 1935)");
            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
