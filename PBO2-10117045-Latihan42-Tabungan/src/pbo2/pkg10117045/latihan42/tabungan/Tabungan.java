package pbo2.pkg10117045.latihan42.tabungan;

public class Tabungan {

    private final int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
        return saldo - jumlah;

    }

}
