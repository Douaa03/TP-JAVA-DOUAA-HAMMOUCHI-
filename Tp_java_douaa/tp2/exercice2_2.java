import java.util.Scanner;

public class exercice2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour X
        System.out.print("Entrez la valeur de X : ");
        int X = scanner.nextInt();

        // Entrée de l'utilisateur pour N
        System.out.print("Entrez la valeur de N : ");
        int N = scanner.nextInt();

        // Calcul de X^N par multiplications successives
        long resultat = calculerPuissance(X, N);

        // Affichage du résultat
        System.out.println("Le résultat de " + X + "^" + N + " est : " + resultat);

        scanner.close();
    }

    private static long calculerPuissance(int X, int N) {
        long resultat = 1;

        // Multiplications successives pour calculer X^N
        for (int i = 0; i < N; i++) {
            resultat *= X;
        }

        return resultat;
    }
}
