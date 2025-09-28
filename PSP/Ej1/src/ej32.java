import java.util.ArrayList;
import java.util.List;

public class ej32 {
    public static void main(String[] args) {

        //Amb un array
        String[] companysArray = {"Ana", "Luis", "Marta", "Carlos", "Elena", "Javier"};

        System.out.println("Nombres con array:");
        for (String nom : companysArray) {
            System.out.println(nom);
        }

        //Amb una llista
        List<String> companysList = new ArrayList<>();
        companysList.add("Ana");
        companysList.add("Luis");
        companysList.add("Marta");
        companysList.add("Carlos");
        companysList.add("Elena");
        companysList.add("Javier");

        System.out.println("\nNombres con lista:");
        for (String nom : companysList) {
            System.out.println(nom);
        }
    }
}

