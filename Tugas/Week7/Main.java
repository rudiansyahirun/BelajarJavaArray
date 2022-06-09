package Tugas.Week7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
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
		String[] buah = {"Apel", "Pisang",
		  "Anggur", "Semangka", "Pepaya"};
	    System.out.println(buah[0]);
	    for (int i = 0; i < (buah.length); i++) {
	    	System.out.print(buah[i]);
	    	if (i == (buah.length -1)) {
	    	    System.out.print(buah[buah.length -1]);
			}
	    }
	}
}
