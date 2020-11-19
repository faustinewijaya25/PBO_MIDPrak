import java.util.Scanner;

public class enkapsulasi
{
	Scanner input =  new Scanner(System.in);
	private String nama;
	private int merek, jumlah, bayar, kembalian, total, tipe1, tipe2;
	private boolean loop = true;
	
	public void Merek()
	{
		System.out.print("Masukkan Nama: ");
			nama = input.nextLine();
		System.out.println("Merek");
		System.out.println("1. Merek G");
		System.out.println("2. Merek O");
	}
	
	public void Tipe()
	{
				System.out.print("Masukkan Pilihan Merek: ");
			merek = input.nextInt();
		
		while(loop)
		{
			switch(merek)
			{
				case 1 : System.out.println("Tipe: ");
						 System.out.println("1. Meja   Rp 95.000");
						 System.out.println("2. Kursi  Rp 125.000");
						 System.out.println("3. Lemari Rp 450.000");
						 System.out.print("Masukkan Pilihan Tipe Barang: ");
						 	tipe1 = input.nextInt();
						 switch(tipe1)
						 {
						 	case 1: System.out.print("Masukkan Jumlah Unit: ");
						 				jumlah = input.nextInt();
						 			total = jumlah * 95000;
						 			System.out.println("Total Harga:  "+total);
						 			System.out.print("Masukkan Bayar:  ");
						 				bayar = input.nextInt();
						 			kembalian = bayar - total;
						 			System.out.println();
						 			System.out.println("Nama: "+nama);
						 			System.out.println("Total Harga:  "+total);
						 			System.out.println("Bayar:  "+bayar);
						 			System.out.println("Kembalian:  "+kembalian);
						 			loop = false; break;
						 	case 2: System.out.print("Masukkan Jumlah Unit: ");
							 			jumlah = input.nextInt();
						 			total = jumlah * 125000;
						 			System.out.println("Total Harga: "+total);
						 			System.out.print("Masukkan Bayar:  ");
							 			bayar = input.nextInt();
						 			kembalian = bayar - total;
						 			System.out.println();
						 			System.out.println("Nama: "+nama);
						 			System.out.println("Total Harga:  "+total);
						 			System.out.println("Bayar: "+bayar);
						 			System.out.println("Kembalian:  "+kembalian);
						 			loop = false; break;
						 	case 3: System.out.print("Masukkan Jumlah Unit: ");
							 			jumlah = input.nextInt();
						 			total = jumlah * 450000;
						 			System.out.println("Total Harga:  "+total);
						 			System.out.print("Masukkan Bayar:  ");
							 			bayar = input.nextInt();
						 			kembalian = bayar - total;
						 			System.out.println();
						 			System.out.println("Nama: "+nama);
						 			System.out.println("Total Harga: "+total);
						 			System.out.println("Bayar:  "+bayar);
						 			System.out.println("Kembalian:  "+kembalian);
						 			loop = false; break;
						 	default: System.out.println("Tipe yang dimasukkan Salah coba Pilih Tipe 1-3");
						 }
						 loop = false; break;
				case 2 : System.out.println("Tipe: ");
					 	 System.out.println("1. Meja   Rp 115.000");
						 System.out.println("2. Kursi  Rp 135.000");
						 System.out.println("3. Lemari Rp 550.000");
						 System.out.print("Masukkan Pilihan Tipe Barang: ");
							 tipe2 = input.nextInt();
						 switch(tipe2)
						 {
						 	case 1: System.out.print("Masukkan Jumlah Unit: ");
							 			jumlah = input.nextInt();
						 			total = jumlah * 115000;
						 			System.out.println("Total Harga:  "+total);
						 			System.out.print("Masukkan Bayar:  ");
							 			bayar = input.nextInt();
						 			kembalian = bayar - total;
						 			System.out.println();
						 			System.out.println("Nama: "+nama);
						 			System.out.println("Total Harga:  "+total);
						 			System.out.println("Bayar:  "+bayar);
						 			System.out.println("Kembalian:  "+kembalian);
						 			loop = false; break;
						 	case 2: System.out.print("Masukkan Jumlah Unit: ");
						 				jumlah = input.nextInt();
						 			total = jumlah * 135000;
						 			System.out.println("Total Harga:  "+total);
						 			System.out.print("Masukkan Bayar:  ");
						 				bayar = input.nextInt();
						 			kembalian = bayar - total;
						 			System.out.println();
						 			System.out.println("Nama: "+nama);
						 			System.out.println("Total Harga:  "+total);
						 			System.out.println("Bayar:  "+bayar);
						 			System.out.println("Kembalian:  "+kembalian);
						 			loop = false; break;
						 	case 3: System.out.print("Masukkan Jumlah Unit: ");
							 			jumlah = input.nextInt();
						 			total = jumlah * 550000;
						 			System.out.println("Total Harga:  "+total);
						 			System.out.print("Masukkan Bayar:  ");
						 				bayar = input.nextInt();
						 			kembalian = bayar - total;
						 			System.out.println();
						 			System.out.println("Nama: "+nama);
						 			System.out.println("Total Harga:  "+total);
						 			System.out.println("Bayar:  "+bayar);
						 			System.out.println("Kembalian:  "+kembalian);
						 			loop = false; break;
						 	default: System.out.println("Tipe yang dimasukkan Salah  Pilih Tipe 1-3");
						}
					default: System.out.println("Merek yang dimasukkan salah  Silahkan pilih antara 1 dan 2!");
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		enkapsulasi e = new enkapsulasi();
		e.Merek();
		e.Tipe();
	}
}