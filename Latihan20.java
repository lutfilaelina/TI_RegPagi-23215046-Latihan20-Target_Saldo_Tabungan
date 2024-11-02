/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Target Saldo Tabungan
 */ 

package Pertemuan6; 

public class Latihan20 {  
    public static void main(String[] args) {
    int saldoAwal = 3500000;
    int saldoTarget = 6000000;
    double bunga = 0.08; 
    int lamaMenabung = 1; //Penjelasan(1)

    while (saldoAwal < saldoTarget) { //Penjelasan(2)
        saldoAwal += saldoAwal * bunga; //Penjelasan(3)
        System.out.printf("Saldo di bulan ke-%d Rp %,d %n", lamaMenabung, saldoAwal);
        //Penjelasan(4)
        lamaMenabung++; //Penjelasan(5) 
}}}


/*PENJELASAN
  (1) Variabel lamaMenabung nantinya akan digunakan untuk mengetahui berapa lama 
      saldo akan terkumpul sesuai target berdasarkan tambahan bunga tiap bulannya.
  (2) While Loop digunakan karena banyaknya iterasi sampai saldoAwal mencapai 
      saldoTarget belum diketahui. 
  (3) Setiap perulangan terjadi saldo akan ditambahkan dengan perhitungan bunga.
  (4) Seperti pada Latihan 19, saya menggunakan formatter %d untuk memanggil argumen
      dari variabel lamaMenabung dan saldoAwal.
  (5) lamaMenabung akan ditambahkan dengan 1 setiap perulangan terjadi.  
*/
    

