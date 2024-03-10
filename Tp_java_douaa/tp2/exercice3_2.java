import java.util.Scanner;

public class exercice3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour N
        System.out.print("Entrez la valeur de N : ");
        int N = scanner.nextInt();

        // Calcul de la somme harmonique
        double somme = calculerSommeHarmonique(N);

        // Affichage du résultat
        System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + somme);

        scanner.close();
    }

    private static double calculerSommeHarmonique(int N) {
        double somme = 0.0;

        for (int i = 1; i <= N; i++) {
            somme += 1.0 / i;
        }

        return somme;
    }
}

