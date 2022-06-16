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
			} else {
				System.out.print(".");
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
		System.out.println("Soal 6");
		System.out.println("------");
		System.out.print("Berapa jumlah siswa: ");
		int jmlSiswa = sc.nextInt();
		int[] nilaiSiswa = new int[jmlSiswa];
		for (int i = 0; i < jmlSiswa; i++) {
			System.out.print("Nilai Siswa ke-" + (i + 1) + ": ");
			nilaiSiswa[i] = sc.nextInt();
		}
		System.out.println("Nilai siswa yang disimpan adalah:");
		for (int i = 0; i < nilaiSiswa.length; i++) {
			System.out.print(nilaiSiswa[i]);
			if (i == (nilaiSiswa.length - 2)) {
				System.out.print(" dan ");
			} else if (i < (nilaiSiswa.length -2)) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
		System.out.println();
		int sumNilaiSiswa = 0;
		System.out.print("Nilai rata-ratanya: ");
		for (int i = 0; i < nilaiSiswa.length; i++) {
			sumNilaiSiswa += nilaiSiswa[i];
		}
		float avgNilai = sumNilaiSiswa / nilaiSiswa.length;
		System.out.println(avgNilai);
		int maxNilai = Arrays.stream(nilaiSiswa)
		  .max()
		  .getAsInt(); // nilai tertinggi
		System.out.println("Nilai paling tinggi: " + maxNilai);
		int minNilai = Arrays.stream(nilaiSiswa)
		  .min()
		  .getAsInt(); // nilai terendah
		System.out.println("Nilai paling rendah: " + minNilai);
		System.out.println();


		/*
		 * Soal 7
			Simpan data dari table berikut dengan menggunakan Array:
			Tampilkan isi table dengan format:
			Daftar Nilai Siswa
			------------------------
			No, Nama, Nilai
			1, Parto, 65
			2, Rendi, 80
			3, Tina, 85
			4, Wanda, 90
			--------------------
			Nilai Rata-Rata: 80
			Nama dan Nilai Tertinggi: Nilai 90 diperoleh oleh Wanda
			Nama dan Nilai Terendah: Nilai 65 diperoleh oleh Parto
		*/
		System.out.println("Soal 7");
		System.out.println("------");
		System.out.println("Daftar Nilai Siswa\n------------------------");
		System.out.println("No, Nama, Nilai");
		String[] tableNama = {"Parto", "Rendi", "Tina", "Wanda"};
		int[] tableNilai = {65, 80, 85, 90};
		for (int i = 0; i < tableNilai.length; i++) {
			System.out.println((i + 1) + ", " + tableNama[i] + ", " + tableNilai[i]);
		}
		System.out.println("--------------------");
		int sumTableNilai = 0;
		System.out.print("Nilai Rata-Rata: ");
		for (int i = 0; i < tableNilai.length; i++) {
			sumTableNilai += tableNilai[i];
		}
		float avgTableNilai = sumTableNilai / tableNilai.length;
		System.out.println(avgTableNilai);
		int maxTableNilai = Arrays.stream(tableNilai).max().getAsInt();
		System.out.println("Nama dan Nilai Tertinggi: Nilai " + maxTableNilai
						  + " diperoleh oleh " + tableNama[findIndex(tableNilai, maxTableNilai)]);
		int minTableNilai = Arrays.stream(tableNilai).min().getAsInt();
		System.out.println("Nama dan Nilai Tertinggi: Nilai " + minTableNilai
						  + " diperoleh oleh " + tableNama[findIndex(tableNilai, minTableNilai)]);
		System.out.println();

		
		/*
		 * Soal 8
			Simpan data nama dan nilai siswa menggunakan Array, datanya diambil
			dari input pengguna. Kemudian tampilkan data dengan format:
			Daftar Nilai Siswa
			------------------------
			No, Nama, Nilai
			1, Parto, 65
			2, Rendi, 80
			3, Tina, 85
			4, Wanda, 90
			--------------------
			Nilai Rata-Rata: 80
			Nama dan Nilai Tertinggi: Nilai 90 diperoleh oleh Wanda
			Nama dan Nilai Terendah: Nilai 65 diperoleh oleh Parto
		*/
		System.out.println("Soal 8");
		System.out.println("------");
		String[] inputTableNama = new String[4];
		int[] inputTableNilai = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Input Nama Siswa" + (i + 1) + ". ");
			inputTableNama[i] = sc.nextLine();
		}
		for (int i = 0; i < 4; i++) {
			System.out.print("Input Nilai dari " + inputTableNama[i] + ": ");
			inputTableNilai[i] = sc.nextInt();
		}
		System.out.println("Daftar Nilai Siswa\n------------------------");
		System.out.println("No, Nama, Nilai");
		for (int i = 0; i < inputTableNilai.length; i++) {
			System.out.println((i + 1) + ", " + inputTableNama[i] + ", " + inputTableNilai[i]);
		}
		System.out.println("--------------------");
		int sumInputedTableNilai = 0;
		System.out.print("Nilai Rata-Rata: ");
		for (int i = 0; i < inputTableNilai.length; i++) {
			sumInputedTableNilai += inputTableNilai[i];
		}
		float avgInputedTableNilai = sumInputedTableNilai / inputTableNilai.length;
		System.out.println(avgInputedTableNilai);
		int maxInputedTableNilai = Arrays.stream(inputTableNilai).max().getAsInt();
		System.out.println("Nama dan Nilai Tertinggi: Nilai " + maxInputedTableNilai
						  + " diperoleh oleh " + inputTableNama[findIndex(inputTableNilai, maxInputedTableNilai)]);
		int minInputedTableNilai = Arrays.stream(inputTableNilai).min().getAsInt();
		System.out.println("Nama dan Nilai Tertinggi: Nilai " + minInputedTableNilai
						  + " diperoleh oleh " + inputTableNama[findIndex(inputTableNilai, minInputedTableNilai)]);
	}
	public static int findIndex(int arr[], int t)
    {
        // Creating ArrayList
        ArrayList<Integer> clist = new ArrayList<>();
 
        // adding elements of array
        // to ArrayList
        for (int i : arr)
            clist.add(i);
 
        // returning index of the element
        return clist.indexOf(t);
    }
}
// COMPILE DI SHELL
/*
javac Tugas/Week7/Main.java
java Tugas/Week7/Main
*/