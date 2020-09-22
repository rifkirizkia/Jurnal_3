import java.util.Scanner;
public class Jurnal3 {
	public static void main(String[] args) {
	Scanner rifki = new Scanner(System.in);
	
	System.out.print("P:");
	int nilai_pratikum = rifki.nextInt();
	System.out.print("A:");
	int asesmen1 = rifki.nextInt();
	System.out.print("B:");
	int asesmen2 = rifki.nextInt();
	
	double total = 0.25 * nilai_pratikum + 0.35 * asesmen1 + 0.4 * asesmen2;
	
	System.out.print(+ total);
	}
}