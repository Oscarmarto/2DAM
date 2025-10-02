import java.awt.desktop.SystemSleepEvent;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        int miliseconds= Integer.parseInt(args[0]);
        try {
            FileReader fr = new FileReader("./files/exemple.txt", StandardCharsets.UTF_8);
            int valor = fr.read();
            while (valor != -1) {
                System.out.print((char) valor);
                valor = fr.read();
                Thread.sleep(miliseconds);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

