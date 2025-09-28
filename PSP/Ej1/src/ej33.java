public class ej33 {

    public static int sumaParells(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero = 10;
        int resultat = sumaParells(numero);
        System.out.println("La suma dels numeros parells fins a " + numero + " es: " + resultat);
    }
}
