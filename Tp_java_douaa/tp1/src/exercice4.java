import java.util.Scanner;
public class exercice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    
		System.out.println("donner un reel et un entier");
	       int n =scanner.nextInt();
	       float x =scanner.nextFloat();
	       System.out.println("le resultat est:"+Math.pow(x,n));
        
}
}
