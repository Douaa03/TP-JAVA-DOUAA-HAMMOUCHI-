import java.util.Scanner;


public class exercice2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try{
        System.out.print("entrer le rayon du cercle");
        double r =scanner.nextFloat();
        double s =Math.PI*r*r;
        double p =Math.PI*2*r;
    System.out.println("la surface est:"+s);
    System.out.println("le perimetre est:"+p);
    } finally {
    scanner.close(); // Close the Scanner object in a finally block
    }
    }
}
