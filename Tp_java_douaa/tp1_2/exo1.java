package Tp_java_douaa.tp1_2;

import java.util.Scanner;

public class exo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un entier positif
        System.out.print("Entrez un entier positif : ");
        int nombre = scanner.nextInt();

        // Vérifie si l'entier est positif
        if (nombre <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
            return;
        }

        // Affiche les diviseurs de ce nombre
        System.out.println("Les diviseurs de " + nombre + " sont :");
        afficherDiviseurs(nombre);

        // Affiche le nombre de diviseurs
        System.out.println("Le nombre de diviseurs est : " + compterDiviseurs(nombre));

        // Affiche la somme des diviseurs
        System.out.println("La somme des diviseurs est : " + calculerSommeDiviseurs(nombre));

        scanner.close();
    }

    private static void afficherDiviseurs(int nombre) {
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Saut de ligne pour une meilleure lisibilité
    }

    private static int compterDiviseurs(int nombre) {
        int count = 0;
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int calculerSommeDiviseurs(int nombre) {
        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }
        return somme;
    }
}
