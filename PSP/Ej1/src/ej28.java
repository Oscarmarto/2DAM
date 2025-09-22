import javax.swing.*;
import java.util.Scanner;

public class ej28 {
    public static void main(String[] args) {
        Vehicle coche1 = new Vehicle();
        Vehicle coche2 = new Vehicle();
        Vehicle coche3 = new Vehicle();
        Vehicle coche4 = new Vehicle();
        Vehicle coche5 = new Vehicle();

        coche1.VerInfo();
        coche2.VerInfo();
        coche3.VerInfo();
        coche4.VerInfo();
        coche5.VerInfo();
    }
}

class Vehicle{
    String tipo;
    String marca;
    String modelo;
    Scanner sc = new Scanner(System.in);


    public Vehicle(){
        System.out.println("Que vehicle es: ");
        tipo = sc.nextLine();
        System.out.println("Que marca es: ");
        marca = sc.nextLine();
        System.out.println("Que modelo es: ");
        modelo = sc.nextLine();
    }

    public void  VerInfo(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}