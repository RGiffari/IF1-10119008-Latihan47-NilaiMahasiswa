package latihan.NilaiMahasiswa;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

public class Main {

    public static void main(String[] args) {
        Nilai nilai = new Nilai(75, 45,34);
        double NA = nilai.hitungNA();
        char Index = nilai.menentukanIndex(NA);
        System.out.println("QUIZ        = " + nilai.getQUIZ());
        System.out.println("UTS         = " + nilai.getUTS());
        System.out.println("UAS         = " + nilai.getUAS());
        System.out.println("\nNIlai Akhir = " + NA);
        System.out.println("\nIndex = " + Index);
        System.out.println("Keterangan = " + nilai.hasilKeterangan(Index));
    }
}
