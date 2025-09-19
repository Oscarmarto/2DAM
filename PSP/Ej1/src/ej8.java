import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {

        System.out.println("De numeros a mes:");
        Scanner numero = new Scanner(System.in);
        System.out.print("Numero :");
        int num = numero.nextInt();

        if(num == 1) {System.out.println("El mes numero 1 es Enero");}
        if(num == 2) {System.out.println("El mes numero 2 es Febrero");}
        if(num == 3) {System.out.println("El mes numero 3 es Marzo");}
        if(num == 4) {System.out.println("El mes numero 4 es Abril");}
        if(num == 5) {System.out.println("El mes numero 5 es Mayo");}
        if(num == 6) {System.out.println("El mes numero 6 es Junio");}
        if(num == 7) {System.out.println("El mes numero 7 es Julio");}
        if(num == 8) {System.out.println("El mes numero 8 es Agosto");}
        if(num == 9) {System.out.println("El mes numero 9 es Septiembre");}
        if(num == 10) {System.out.println("El mes numero 10 es Octubre");}
        if(num == 11) {System.out.println("El mes numero 11 es Noviembre");}
        if(num == 12) {System.out.println("El mes numero 12 es Diciembre");}
    }
}
