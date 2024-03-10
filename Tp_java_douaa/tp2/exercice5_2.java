import java.util.Scanner;

public class exercice5_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour n
        System.out.print("Entrez la valeur de n : ");
        int n = scanner.nextInt();

        // Calcul de n! avec une boucle while
        long resultatWhile = calculerFactorielWhile(n);
        System.out.println("n! (avec while) : " + resultatWhile);

        // Calcul de n! avec une boucle for
        long resultatFor = calculerFactorielFor(n);
        System.out.println("n! (avec for) : " + resultatFor);

        scanner.close();
    }

    private static long calculerFactorielWhile(int n) {
        long resultat = 1;
        int i = 1;

        while (i <= n) {
            resultat *= i;
            i++;
        }

        return resultat;
    }

    private static long calculerFactorielFor(int n) {
        long resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }

        return resultat;
    }
}
