import java.util.Scanner;

public class exercice4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour N
        System.out.print("Entrez le nombre de lignes (N) : ");
        int N = scanner.nextInt();

        // Affichage du triangle d'étoiles
        afficherTriangleEtoiles(N);

        scanner.close();
    }

    private static void afficherTriangleEtoiles(int N) {
        for (int i = 1; i <= N; i++) {
            // Affichage d'une ligne avec i étoiles
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Passage à la ligne pour la prochaine itération
            System.out.println();
        }
    }
}

