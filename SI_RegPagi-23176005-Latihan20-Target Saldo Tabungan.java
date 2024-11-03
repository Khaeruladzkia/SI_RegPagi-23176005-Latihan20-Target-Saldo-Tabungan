/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 20 - Target Saldo Tabungan
 * Deskripsi Program    : Menghitung jumlah bulan yang diperlukan agar saldo tabungan mencapai saldo target.
 **/
package pertemuan.pkg6;
public class Latihan20 {
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double saldoTarget = 6000000;
        int bulan = 0;
        
        while(saldoAwal < saldoTarget) {
            bulan++;
            saldoAwal += saldoAwal * bunga;
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + saldoAwal);
        }
    }
}


