package Tp_java_douaa.tp3;

import java.util.Scanner;

public class exo2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration du tableau
        int[] tableau = new int[10];

        // Remplissage du tableau par l'utilisateur
        remplirTableau(tableau, scanner);

        // Affichage du tableau
        afficherTableau(tableau);

        scanner.close();
    }

    private static void remplirTableau(int[] tableau, Scanner scanner) {
        System.out.println("Veuillez entrer les 10 éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément à l'indice " + i + " : ");
            tableau[i] = scanner.nextInt();
        }
    }

    private static void afficherTableau(int[] tableau) {
        System.out.println("\nContenu du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(); // Ajout d'un saut de ligne à la fin pour une meilleure lisibilité
    }
}


