import java.io.FileWriter;

public class Sumador2 {

	public static int sumar(int n1, int n2) {
		System.out.println("Sumando de " + n1 + " hasta " + n2);
		int resultado = 0;
		for(int i = n1; i <= n2; i++) {
			resultado = resultado + i;
			
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		try {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = sumar(n1,n2);
		
		FileWriter escritor = new FileWriter(args[2]);
		
		escritor.write("Resultado de este sumador: " + resultado);
		
		escritor.close();
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}

}
