import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a + b;
            int d = a - b;
            int e = a * b;
            float f = (float) a / b;
            System.out.println("la somme est :" + c);
            System.out.println("la soustraction est :" + d);
            System.out.println("le produit est :" + e);
            System.out.println("la division est :" + f);
        } finally {
            scanner.close(); // Close the Scanner object in a finally block
        }
    }
}