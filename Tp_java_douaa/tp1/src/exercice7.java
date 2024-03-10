import java.util.Scanner;

public class exercice7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour les valeurs de a, b et c
        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        // Résolution de l'équation du second degré
        resoudreEquationSecondDegre(a, b, c);

        scanner.close();
    }

    private static void resoudreEquationSecondDegre(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Deux solutions réelles distinctes
            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("L'équation a deux solutions réelles distinctes : x1 = " + racine1 + ", x2 = " + racine2);
        } else if (discriminant == 0) {
            // Une solution réelle double
            double racine = -b / (2 * a);
            System.out.println("L'équation a une solution réelle double : x = " + racine);
        } else {
            // Aucune solution réelle
            System.out.println("L'équation n'a pas de solution réelle.");
        }
    }
}

