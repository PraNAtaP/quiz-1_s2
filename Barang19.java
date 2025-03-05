public class Barang19 {
    String kode;
    String nama;
    int harga;
    int stok;

    public Barang19(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanBarang() {
        System.out.printf("%-10s %-20s Rp.%-12d %-5d%n", kode, nama, harga, stok);
    }
}