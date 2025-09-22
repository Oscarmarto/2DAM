import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros del 1 al 10");
        System.out.print("1. ");
        int num1 = sc.nextInt();
        System.out.print("2. ");
        int num2 = sc.nextInt();
        System.out.print("3. ");
        int num3 = sc.nextInt();
        int num4 = (int)(Math.random()*10)+1;
        int prem;
        if(num1 == num4 || num2 == num4 || num3 == num4){
            System.out.println("El numero es correcto");
            System.out.println("Elige un peluche de premio");
            System.out.println("El 1 es un perro, el 2 un gato y el 3 es una jirafa");
            prem = sc.nextInt();
            switch (prem){
                case 1:
                    System.out.println("Has elegido el perro!");
                    break;
                case 2:
                    System.out.println("Has elegido el gato");
                    break;
                case 3:
                    System.out.println("Has elegido el jirafa");
                    break;
                default:
                    System.out.println("Pero pon el numero bien");
                    break;
            }
        }else{
            System.out.println("El numero es incorrecto");
        }
    }
}
