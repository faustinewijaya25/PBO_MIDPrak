import java.util.Scanner;
class merek {

	Scanner masukan = new Scanner(System.in);
	int pilihan1, pilihan2, pilihan3;
	int jumlahunit;
	String nama;
	int total, bayar, kembalian;
	boolean loop = true;
	
	void tampil() {
	System.out.print("Masukkan Nama = ");
	nama = masukan.nextLine();
	System.out.println("Merek: ");
	System.out.println("1. Merek G");
	System.out.println("2. Merek O");
	}
}