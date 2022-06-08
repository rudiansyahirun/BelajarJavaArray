class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");


    	// ARRAY
		// # cara 1
		int[] A = new int[5];
		A[0] = 10;
		A[1] = 5;
		A[2] = 6;
		A[3] = 8;
		A[4] = 2;

		// # cara 2
		int[] B = {10, 5, 6, 8, 2};


		/*
		Buatlah Array 1 dimensi berisi 3 data String untuk mengisi nama pemenang
			Nama	: Pemenang
			Jumlah	: 3 elemen
			Tipe	: String
		*/
		// # cara 1
		String[] namaPemenang = {"Ani", "Asep", "Ali"};
		// # cara 2
		String[] namaPengalah = new String[3];
		namaPengalah[0] = "Ani";
		namaPengalah[1] = "Asep";
		namaPengalah[2] = "Ali";


		/*
		Buatlah Array 1 dimensi berisi 3 data Integer untuk mengisi nilai pemenang
			Nama	: Pemenang
			Jumlah	: 3 elemen
			Tipe	: Integer
		*/
		// # cara 1
		int[] nilaiPemenang = {80, 90, 95};
		// # cara 2
		int[] nilaiPengalah = new int[3];
		nilaiPengalah[0] = 80;
		nilaiPengalah[1] = 90;
		nilaiPengalah[2] = 95;


		
		// CETAK ISI ARRAY int cara 1
		int[] nilaiA = {80, 75, 91, 61, 95};
		System.out.println("cetak cara 1");
		for(int index = 0; index < 5; index++) {
			System.out.println(nilaiA[index]);
		}

		// CETAK ISI ARRAY int cara 2
		int[] nilaiB;
		nilaiB = new int[5];
		nilaiB[0] = 80;
		nilaiB[1] = 75;
		nilaiB[2] = 90;
		nilaiB[3] = 60;
		nilaiB[4] = 95;
		System.out.println("cetak cara 2");
		for(int index = 0; index < 5; index++) {
			System.out.println(nilaiB[index]);
		}


		// CETAK ISI ARRAY String
		String[] namaA = {"Ani", "Budi", "Cecep"};
		System.out.println("cetak array string");
		for(int index = 0; index <= 2; index++) {
			System.out.println(namaA[index]);
		}



		/*
		Jika sebuah array sudah dideklarasikan dan diinisialisasi, maka jumlah elemen dari array tersebut dapat diambil dengan menggunakan perintah namaArray.length
			Contoh:
				int[] nilai = {90,80,70};
				System.out.println(nilai.length);
		*/
	}
}