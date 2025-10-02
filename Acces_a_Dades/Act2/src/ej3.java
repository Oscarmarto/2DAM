import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class ej3 {
    public static void main(String[] args) {
        int miliseconds= Integer.parseInt(args[0]);
        char[] charBlock = new char[100];
        try {
            FileReader fr = new FileReader("./files/exemple.txt", StandardCharsets.UTF_8);
            int valor = fr.read();
            int read(charBlock[] )
            while (valor != -1) {
                valor = fr.read();
                Thread.sleep(miliseconds);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
