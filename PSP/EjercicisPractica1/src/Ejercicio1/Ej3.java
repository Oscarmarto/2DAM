package Ejercicio1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.print("Numero 1 :");
		int num1 = num.nextInt();
		System.out.print("Numero 2 :");
		int num2 = num.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("El resultat es :"+suma);
	
	}

}
