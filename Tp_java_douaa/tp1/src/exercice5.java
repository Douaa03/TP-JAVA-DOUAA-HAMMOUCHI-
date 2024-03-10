import java.util.Scanner;

public class exercice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour le nombre entier
        System.out.print("Entrez un nombre entier pour calculer sa factorielle : ");
        int n = scanner.nextInt();

        // Calcul de la factorielle
        long resultat = calculerFactoriel(n);

        // Affichage du résultat
        System.out.println("La factorielle de " + n + " est : " + resultat);

        scanner.close();
    }

    private static long calculerFactoriel(int n) {
        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
            return -1; // Valeur sentinelle pour indiquer une erreur
        }

        long resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }

        return resultat;
    }
}
