import java.util.List;

public class ej35 {

    // Mètode per a arrays
    public static int majorArray(int[] arr) {
        int major = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > major) {
                major = num;
            }
        }
        return major;
    }

    // Mètode per a llistes
    public static int majorLlista(List<Integer> llista) {
        int major =  Integer.MIN_VALUE;
        for (int num : llista) {
            if (num > major) {
                major = num;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] numsArray = {3, 17, 44, 9, 235};
        List<Integer> numsList = List.of(3, 37, 22, 9, 777);

        System.out.println("Major en l'array: " + majorArray(numsArray));
        System.out.println("Major en la llista: " + majorLlista(numsList));
    }
}
