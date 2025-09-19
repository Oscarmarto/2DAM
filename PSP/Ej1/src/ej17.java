import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu una contraseña amb mínim 5 caràcters, 1 número i 1 lletra majúscula:");
        String con = sc.nextLine();
        int carac = 0;
        boolean num = false;
        boolean mayuscula = false;
        for(int i = 0; i < con.length(); i++){
            char c = con.charAt(i);
            if(Character.isLetter(c)){
                carac++;
            }
            if(Character.isDigit(c)){
                num = true;
            }
            if(Character.isUpperCase(c)){
                mayuscula = true;
            }
        }

        if(carac >= 5 && num && mayuscula){
            System.out.println("La contraseña es valida");
        }else{
            System.out.println("La contraseña es invalida");
        }
    }

}
