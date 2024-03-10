package Tp_java_douaa.tp3;

import java.util.Arrays;
import java.util.Scanner;

public class exo4_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture de la taille N du tableau
        int N;
        do {
            System.out.print("Entrez la taille N du tableau (entre 10 et 50) : ");
            N = scanner.nextInt();
        } while (N < 10 || N > 50);

        // Déclaration et initialisation du tableau
        int[] tableau = new int[N];

        // Remplissage du tableau par l'utilisateur
        remplirTableau(tableau, scanner);

        // Affichage du tableau initial
        System.out.println("\nTableau initial :");
        afficherTableau(tableau);

        // Suppression des occurrences de 5 et tassement des éléments
        tableau = supprimerOccurencesEtTasser(tableau);

        // Affichage du tableau résultant
        System.out.println("\nTableau après suppression des occurrences de 5 :");
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

    private static int[] supprimerOccurencesEtTasser(int[] tableau) {
        int tailleActuelle = tableau.length;
        int nouvelIndice = 0;

        for (int ancienIndice = 0; ancienIndice < tailleActuelle; ancienIndice++) {
            if (tableau[ancienIndice] != 5) {
                tableau[nouvelIndice] = tableau[ancienIndice];
                nouvelIndice++;
            }
        }

        // Ajuster la taille du tableau après tassement
        return Arrays.copyOf(tableau, nouvelIndice);
    }
}


