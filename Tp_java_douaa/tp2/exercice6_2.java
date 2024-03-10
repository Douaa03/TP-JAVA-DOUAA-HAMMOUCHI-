import java.util.Scanner;
//**********************************Programme pour tester si un nombre est premier : *****************************/
/*import java.util.Scanner;

public class TestNombrePremier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour le nombre à tester
        System.out.print("Entrez un nombre pour vérifier s'il est premier : ");
        int nombre = scanner.nextInt();

        // Test si le nombre est premier
        if (estPremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }

        scanner.close();
    }

    private static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
 */


 //********************************** Programme pour tester tous les nombres entre 1 et N : *****************************/

public class exercice6_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour la valeur de N
        System.out.print("Entrez la valeur de N pour tester les nombres premiers jusqu'à N : ");
        int N = scanner.nextInt();

        // Teste tous les nombres entre 1 et N
        System.out.println("Nombres premiers entre 1 et " + N + " :");
        for (int i = 1; i <= N; i++) {
            if (estPremier(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    private static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

