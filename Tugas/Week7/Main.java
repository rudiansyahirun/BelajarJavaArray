package Tugas.Week7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // WEEK 7
	    /*
	     * Soal 1
			Buatlah sebuah aplikasi yang menyimpan sebuah
			array berisi 5 nama buah. Kemudian tampilkan
			nama-nama tersebut ke layar dalam bentuk kalimat
			seperti contoh di bawah. Setiap buah dengan
			dipisahkan tanda koma kecuali buah yang terakhir
			dipisahkan kata dan serta diakhiri dengan tanda titik .
			Contoh Format:
			Buah yang tersedia adalah:
			Apel, Pisang, Anggur, Semangka dan Pepaya.
	     * */
		System.out.println("Soal 1");
		System.out.println("------");
		String[] buah = {"Apel", "Pisang",
		  "Anggur", "Semangka", "Pepaya"};
		System.out.println("Buah yang tersedia adalah: ");
	    for (int i = 0; i < (buah.length -1); i++) {
	    	System.out.print(buah[i]);
	    	if (i == (buah.length -2)) {
	    	    System.out.print(" dan ");
			} else {
				System.out.print(", ");
			}
	    }
		System.out.println(buah[buah.length -1] + ".");
		System.out.println();


		/*
		 * Soal 2
			Dalam sebuah program Java buat sebuah Array
			yang menampung data sebagai berikut: 5, 7, 3, 4,
			5, 6, 7, 2
			Tampilkan nilai total dari isi array tadi!
		*/
		System.out.println("Soal 2");
		System.out.println("------");
		int[] data = {5,7,3,4,5,6,7,2};
		System.out.print("Nilai total dari isi array: ");
		System.out.print("{");
		for (int i = 0; i < data.length -1; i++) {
			System.out.print(data[i]);
			System.out.print(", ");
		}
		System.out.print(data[data.length -1]);
		System.out.println("}");
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		System.out.println(sum);
		System.out.println();

		
		/*
		 * Soal 3
			Dengan sebuah program Java, simpan data nama mahasiswa dalam sebuah
			array dengan kapasitas 6 data.
			Data yang disimpan adalah:
			Ani, Budi, Cecep, Dedi, Erna, Fatah.
			Tampilkan Kembali isi data array tadi dengan format:
			Daftar Nama Mahasiswa
			---------------------
			1. Ani
			2. Budi
			3. Cecep
			4. Dedi
			5. Erna
			6. Fatah
			---------------------
			Jumlah Mahasiswa = 6 Orang
		*/
		System.out.println("Soal 3");
		System.out.println("------");
		System.out.println("Daftar Nama Mahasiswa");
		System.out.println("---------------------");
		String[] nama = {"Ani", "Budi", "Cecep", "Dedi", "Erna", "Fatah"};
		for (int i = 0; i < nama.length; i++) {
			System.out.print(i + 1 + ". ");
			System.out.println(nama[i]);
		}
		System.out.println("---------------------");
		System.out.println();


		/*
		 * Soal 4
			Buatlah sebuah aplikasi yang akan menyimpan
			sebuah array berisi 5 nama buah. Minta input 5
			nama buah dari user dan dimasukkan ke dalam
			array.
			Kemudian tampilkan nama-nama tersebut ke
			layar dalam bentuk kalimat seperti contoh di
			bawah. Setiap buah dengan dipisahkan tanda
			koma kecuali buah yang terakhir dipisahkan kata
			dan serta diakhiri dengan tanda titik . Contoh
			Format:
			Buah yang tersedia adalah:
			Apel, Pisang, Anggur, Semangka dan Pepaya.
		*/
		System.out.println("Soal 4");
		System.out.println("------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Berapa jenis buah: ");
		int jumlah = sc.nextInt();
		int count = 0;
		String[] inputBuah = new String[jumlah];
		for (int i = 0; i < jumlah; i++) {
			count++;
			System.out.print("Input buah: " + count + ". ");
			inputBuah[i] = sc.next();
		}
		
		System.out.println("Buah yang tersedia adalah: ");
	    for (int i = 0; i < (inputBuah.length -1); i++) {
	    	System.out.print(inputBuah[i]);
	    	if (i == (inputBuah.length -2)) {
	    	    System.out.print(" dan ");
			} else {
				System.out.print(", ");
			}
	    }
		System.out.println(inputBuah[inputBuah.length -1] + ".");
		System.out.println();


		/*
		 * Soal 5
			Buatlah sebuah program Java yang menyimpan
			data nilai 5 orang Mahasiswa. Nilai yang disimpan
			adalah 90, 80, 85, 70 dan 95.
			Hitung dan tampilkan nilai rata-rata dari kelima
			nilai tadi!
			Tampilkan nilai paling tinggi!
			Tampilkan nilai paling rendah!
		*/
		System.out.println("Soal 5");
		System.out.println("------");
		int[] nilai = {90,80,85,70,95};
		System.out.println("Nilai 5 orang Mahasiswa yang disimpan adalah:");
		for (int i = 0; i < nilai.length; i++) {
			System.out.print(nilai[i]);
			if (i == (nilai.length - 2)) {
				System.out.print(" dan ");
			} else if (i < (nilai.length -2)) {
				System.out.print(", ");
			}
		}
		System.out.println();
		int sumNilai = 0;
		System.out.print("Nilai rata-ratanya: ");
		for (int i = 0; i < nilai.length; i++) {
			sumNilai += nilai[i];
		}
		float avg = sumNilai / nilai.length;
		System.out.println(avg);
		int max = Arrays.stream(nilai)
		  .max()
		  .getAsInt(); // nilai tertinggi
		System.out.println("Nilai paling tinggi: " + max);
		int min = Arrays.stream(nilai)
		  .min()
		  .getAsInt(); // nilai terendah
		System.out.println("Nilai paling rendah: " + min);
		System.out.println();


		/*
		 * Soal 6
			Buatlah sebuah program Java yang menyimpan
			data nilai 5 orang Mahasiswa. Kelima nilai ini
			dimasukkan oleh pengguna.
			Hitung dan tampilkan nilai rata-rata dari kelima
			nilai tadi!
			Tampilkan nilai paling tinggi!
			Tampilkan nilai paling rendah!
		*/
	}
}
// COMPILE DI SHELL
/*
javac Tugas/Week7/Main.java
java Tugas/Week7/Main
*/