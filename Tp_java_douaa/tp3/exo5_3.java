package Tp_java_douaa.tp3;
import java.util.Scanner;

public class exo5_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture de la taille N du tableau
        System.out.print("Entrez la taille N du tableau : ");
        int N = scanner.nextInt();

        // Déclaration et initialisation du tableau
        int[] tableau = new int[N];

        // Remplissage du tableau par l'utilisateur
        remplirTableau(tableau, scanner);

        // Affichage du tableau initial
        System.out.println("\nTableau initial :");
        afficherTableau(tableau);

        // Inversion des éléments du tableau sans utiliser de tableau d'aide
        inverserTableau(tableau);

        // Affichage du tableau résultant
        System.out.println("\nTableau après inversion :");
        afficherTableau(tableau);

        scanner.close();
    }

    private static void remplirTableau(int[] tableau, Scanner scanner) {
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément à l'indice " + i + " : ");
            tableau[i] = scanner.nextInt();
        }
    }

    private static void afficherTableau(int[] tableau) {
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println(); // Ajout d'un saut de ligne à la fin pour une meilleure lisibilité
    }

    private static void inverserTableau(int[] tableau) {
        int debut = 0;
        int fin = tableau.length - 1;

        while (debut < fin) {
            // Échanger les éléments aux positions debut et fin
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;

            // Déplacer les indices vers le centre du tableau
            debut++;
            fin--;
        }
    }
}
