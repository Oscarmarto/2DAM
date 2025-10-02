import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class ej1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("./files/exemple.txt", StandardCharsets.UTF_8);
            int valor = fr.read();
            while (valor != -1) {
                System.out.print((char) valor);
                valor = fr.read();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
