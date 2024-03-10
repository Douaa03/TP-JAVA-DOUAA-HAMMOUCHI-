import java.util.Scanner;
public class exercice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    try {
		System.out.print("donner deux entiers");
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c;
        c=a;
        
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
        }finally{
            scanner.close(); // Close the Scanner object in a finally block
        }
}
}
