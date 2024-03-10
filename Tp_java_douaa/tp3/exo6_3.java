package Tp_java_douaa.tp3;

import java.util.Scanner;

public class exo6_3 {

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

        // Création des tableaux TP et TN
        int[] tableauPositives = copierPositives(tableau);
        int[] tableauNegatives = copierNegatives(tableau);

        // Affichage des tableaux TP et TN
        System.out.println("\nTableau des composantes positives (TP) :");
        afficherTableau(tableauPositives);

        System.out.println("\nTableau des valeurs négatives (TN) :");
        afficherTableau(tableauNegatives);

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

    private static int[] copierPositives(int[] tableau) {
        int countPositives = countPositives(tableau);
        int[] tableauPositives = new int[countPositives];

        int index = 0;
        for (int element : tableau) {
            if (element > 0) {
                tableauPositives[index++] = element;
            }
        }

        return tableauPositives;
    }

    private static int[] copierNegatives(int[] tableau) {
        int countNegatives = countNegatives(tableau);
        int[] tableauNegatives = new int[countNegatives];

        int index = 0;
        for (int element : tableau) {
            if (element < 0) {
                tableauNegatives[index++] = element;
            }
        }

        return tableauNegatives;
    }

    private static int countPositives(int[] tableau) {
        int count = 0;
        for (int element : tableau) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    private static int countNegatives(int[] tableau) {
        int count = 0;
        for (int element : tableau) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }
}

