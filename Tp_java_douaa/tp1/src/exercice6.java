import java.util.Scanner;

public class exercice6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour les valeurs de a et b
        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        // Résolution de l'équation du premier degré
        resoudreEquationPremierDegre(a, b);

        scanner.close();
    }

    private static void resoudreEquationPremierDegre(double a, double b) {
        if (a == 0) {
            // L'équation n'est pas du premier degré
            if (b == 0) {
                System.out.println("L'équation a une infinité de solutions.");
            } else {
                System.out.println("L'équation n'a pas de solution.");
            }
        } else {
            // L'équation est du premier degré
            double solution = -b / a;
            System.out.println("L'équation a une solution unique : x = " + solution);
        }
    }
}
