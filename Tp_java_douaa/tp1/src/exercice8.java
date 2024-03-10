import java.util.Scanner;

public class exercice8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour les deux entiers
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();

        // Calcul et affichage du PGCD
        int pgcd = calculerPGCD(a, b);
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);

        scanner.close();
    }

    private static int calculerPGCD(int a, int b) {
        // Utilisation de l'algorithme d'Euclide pour calculer le PGCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // PGCD doit être un nombre positif
    }
}
