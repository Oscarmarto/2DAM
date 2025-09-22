import java.util.ArrayList;
import java.util.Scanner;

public class ej29 {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    }
}

class Vehiculo{
    String tipo;
    String marca;
    String modelo;
    Scanner sc = new Scanner(System.in);


    public Vehiculo() {
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