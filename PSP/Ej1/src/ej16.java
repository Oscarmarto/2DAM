import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la teua fecha de naixement: (dd/mm/yyyy)");
        String fecha = sc.nextLine();

        int suma = 0;
        for(int i = 0; i < fecha.length(); i++){
            char c = fecha.charAt(i);
            if(Character.isDigit(c)){
                suma += Character.getNumericValue(c);
            }
        }

        System.out.println("El teu numero de la sort es:"+ suma);
    }
}
