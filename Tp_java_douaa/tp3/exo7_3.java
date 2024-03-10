package Tp_java_douaa.tp3;

import java.util.Scanner;

public class exo7_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Étape 1 : Demande à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Étape 2 : Crée un objet tableau avec la taille entrée par l'utilisateur
        int[] tableau = new int[taille];

        // Étape 3 : Demande à l'utilisateur de remplir le tableau
        remplirTableau(tableau, scanner);

        // Étape 4 : Calcule la somme des éléments saisis
        int somme = calculerSomme(tableau);

        // Étape 5 : Calcule la moyenne des éléments
        double moyenne = calculerMoyenne(tableau);

        // Affichage des résultats
        System.out.println("Somme des éléments : " + somme);
        System.out.println("Moyenne des éléments : " + moyenne);

        scanner.close();
    }

    private static void remplirTableau(int[] tableau, Scanner scanner) {
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément à l'indice " + i + " : ");
            tableau[i] = scanner.nextInt();
        }
    }

    private static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int element : tableau) {
            somme += element;
        }
        return somme;
    }

    private static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            return 0; // Pour éviter une division par zéro si le tableau est vide
        }

        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }
}

