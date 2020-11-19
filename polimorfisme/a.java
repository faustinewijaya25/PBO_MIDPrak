class a extends merek {
	void tampila() {
		System.out.println("Tipe: ");
					System.out.println("1. Meja : Rp.95.000");
					System.out.println("2. Kursi : Rp.125.000");
					System.out.println("3. Lemari : Rp.450.000");
					System.out.print("Tipe yang dipilih = ");
					pilihan1 = masukan.nextInt();
					switch(pilihan1) {
					case 1 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = masukan.nextInt();
							   total = jumlahunit*95000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - total;
							   loop =  false; break;
					case 2 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = masukan.nextInt();
							   total = jumlahunit*125000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - total; 
							   loop =  false; break; 
					case 3 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = masukan.nextInt();
							   total = jumlahunit*450000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
					           kembalian = bayar - total; 
							   loop =  false; break;
					default : System.out.println("Tipe yang Anda masukkkan Salah, Silahkan pilih tipe 1-3");
					}
	}
}