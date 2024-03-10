package Tp_java_douaa.tp3;


public class exo1_3 {

    public static void main(String[] args) {
        // Déclaration et initialisation d'un tableau d'entiers
        int[] tableau = {1, 2, 3, 4, 5};

        // Affichage des éléments du tableau
        System.out.println("Éléments du tableau :");
        afficherTableau(tableau);
    }

    private static void afficherTableau(int[] tableau) {
        // Parcours du tableau et affichage de chaque élément
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément à l'indice " + i + " : " + tableau[i]);
        }
    }
}
