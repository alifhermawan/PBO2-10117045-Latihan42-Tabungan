package pbo2.pkg10117045.latihan42.tabungan;
/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk mencari jumlah sisa 
 * saldo setelah dilakukan penarikan 
 */
import java.util.Scanner;

public class Utama {

    public static void main(String[] args) {
        int jumlah;
        Scanner scn = new Scanner(System.in);

        System.out.println("====Program Penarikan Uang====");

        System.out.print("Masukan Saldo Awal : ");
        Tabungan tbg = new Tabungan(scn.nextInt());

        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlah = scn.nextInt();

        System.out.println("Saldo Anda Sekarang : " + tbg.ambilUang(jumlah));

    }

}
