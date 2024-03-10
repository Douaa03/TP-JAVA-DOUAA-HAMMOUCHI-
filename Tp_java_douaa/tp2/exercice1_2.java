import java.util.Scanner;

public class exercice1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire N au clavier
        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        // Utilisation de while
        calculerEtAfficherWhile(N);

        // Utilisation de do-while
        calculerEtAfficherDoWhile(N);

        // Utilisation de for
        calculerEtAfficherFor(N);

        scanner.close();
    }

    private static void calculerEtAfficherWhile(int N) {
        int sommeWhile = 0;
        long produitWhile = 1;
        int iWhile = 0;

        System.out.println("Utilisation de while:");

        while (iWhile < N) {
            System.out.print("Entrez le nombre : ");
            int nombre = new Scanner(System.in).nextInt();

            sommeWhile += nombre;
            produitWhile *= nombre;
            iWhile++;
        }

        double moyenneWhile = (double) sommeWhile / N;

        afficherResultats(sommeWhile, produitWhile, moyenneWhile);
    }

    private static void calculerEtAfficherDoWhile(int N) {
        int sommeDoWhile = 0;
        long produitDoWhile = 1;
        int iDoWhile = 0;

        System.out.println("\nUtilisation de do-while:");

        do {
            System.out.print("Entrez le nombre : ");
            int nombre = new Scanner(System.in).nextInt();

            sommeDoWhile += nombre;
            produitDoWhile *= nombre;
            iDoWhile++;
        } while (iDoWhile < N);

        double moyenneDoWhile = (double) sommeDoWhile / N;

        afficherResultats(sommeDoWhile, produitDoWhile, moyenneDoWhile);
    }

    private static void calculerEtAfficherFor(int N) {
        int sommeFor = 0;
        long produitFor = 1;

        System.out.println("\nUtilisation de for:");

        for (int iFor = 0; iFor < N; iFor++) {
            System.out.print("Entrez le nombre : ");
            int nombre = new Scanner(System.in).nextInt();

            sommeFor += nombre;
            produitFor *= nombre;
        }

        double moyenneFor = (double) sommeFor / N;

        afficherResultats(sommeFor, produitFor, moyenneFor);
    }

    private static void afficherResultats(int somme, long produit, double moyenne) {
        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);
    }
}
