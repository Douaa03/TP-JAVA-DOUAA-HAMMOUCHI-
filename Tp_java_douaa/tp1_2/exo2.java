package Tp_java_douaa.tp1_2;
import java.util.Scanner;
public class exo2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez l'heure : ");
            int heures = scanner.nextInt();
            System.out.print("Entrez les minutes : ");
            int minutes = scanner.nextInt();
            int nouvelleHeure;
            int nouvelleMinute;
            //calcul de l'heure plus tard
            if (minutes == 59) {
                nouvelleHeure = (heures + 1) % 24;
                nouvelleMinute = 0;
            } else {
                nouvelleHeure = heures;
                nouvelleMinute = minutes + 1;
            }
    
            // Affichage du résultat
            System.out.println("Dans une minute, il sera " + nouvelleHeure + " heure(s) " + nouvelleMinute + " minute(s).");
    
            scanner.close();
        }
    }
    
