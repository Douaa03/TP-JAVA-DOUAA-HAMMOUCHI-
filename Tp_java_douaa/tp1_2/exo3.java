package Tp_java_douaa.tp1_2;
import java.util.Scanner;
public class exo3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un entier positif supérieur à 1 : ");
            int n = scanner.nextInt();
    
            // Vérifie si l'entier est parfait
            if (estNombreParfait(n)) {
                System.out.println(n + " est un nombre parfait.");
            } else {
                System.out.println(n + " n'est pas un nombre parfait.");
            }
            scanner.close();
        }
    
        // Méthode pour vérifier si un nombre est parfait
        private static boolean estNombreParfait(int nombre) {
            if (nombre <= 1) {
                return false;
            }
    
            int sommeDiviseurs = 1; // Initialisation avec 1, car tout nombre est divisible par 1
    
            // Parcours des diviseurs potentiels jusqu'à la racine carrée du nombre
            for (int i = 2; i * i <= nombre; i++) {
                if (nombre % i == 0) {
                    sommeDiviseurs += i;
                    if (i != nombre / i) {
                        sommeDiviseurs += nombre / i;
                    }
                }
            }
    
            // Le nombre est parfait si la somme des diviseurs est égale au nombre lui-même
            return sommeDiviseurs == nombre;
        }
    }

