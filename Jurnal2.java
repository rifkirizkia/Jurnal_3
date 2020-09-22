import java.util.Scanner;
public class Jurnal2 {
	public static void main(String[] args) {
	Scanner dira = new Scanner(System.in);
	System.out.println("nama mata kuliah:");
	String nama_matkul = dira.nextLine();
	System.out.println("jumlah jam per minggu:");
	int jumlah_jam = dira.nextInt();
	
	System.out.println("Aku suka kuliah " +nama_matkul+ ".");
	System.out.println("kuliah " +jumlah_jam+  " jam per minggu rasanya kurang.");
	System.out.println("Tambahin dong jadi " +2 * jumlah_jam+ " jam per minggu :)");
	}
}