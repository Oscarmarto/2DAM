
public class Calculadora {

	public void executar(String ruta){
		ProcessBuilder pb;
		try {
		pb = new ProcessBuilder(ruta);
		pb.start();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		public static void main(String[] args) {
		String ruta = "C:\\Windows\\System32\\calc.exe";
		Calculadora lp = new Calculadora();
		lp.executar(ruta);
		System.out.println("Finalitzat");
		}

}
