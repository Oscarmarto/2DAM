import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Lanzador {

	public static void lanzar(int n1, int n2, String texto) {
		try {
			String javaHome = System.getProperty("java.home");
			String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
			String classpath = System.getProperty("java.class.path");
			String clase = "Sumador2";

			List<String> command = new ArrayList<>();

			command.add(javaBin);
			command.add("-cp");
			command.add(classpath);
			command.add(clase);
			command.add(String.valueOf(n1));
			command.add(String.valueOf(n2));
			command.add(texto);

			ProcessBuilder builder = new ProcessBuilder(command);
			
			builder.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Resposta.txt";
		lanzar(1, 50, texto);
		lanzar(51, 100, texto);
		System.out.println("Fin de lanzador");
	}
}