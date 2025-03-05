public class TransaksiBarang {
    Barang19[] barangs;
    Barang19[] pembelians;
    int jumlahBarang;
    int jumlahPembelian;

    public TransaksiBarang(int maxBarang, int maxPembelian) {
        barangs = new Barang19[maxBarang];
        pembelians = new Barang19[maxPembelian];
        jumlahBarang = 0;
        jumlahPembelian = 0;
    }

    public void tambahBarang(Barang19 barang) {
        if (jumlahBarang < barangs.length) {
            barangs[jumlahBarang] = barang;
            jumlahBarang++;
        } else {
            System.out.println("Kapasitas barang penuh!");
        }
    }

    public void tampilkanBarang() {
        System.out.printf("%-10s %-20s %-15s %-5s%n", "Kode", "Nama", "Harga", "Stok");
        System.out.println("==================================================================");
        for (int i = 0; i < jumlahBarang; i++) {
            barangs[i].tampilkanBarang();
        }
    }

    public void beliBarang(String kode) {
        for (int i = 0; i < jumlahBarang; i++) {
            if (barangs[i].kode.equals(kode)) {
                if (barangs[i].stok > 0) {
                    if (jumlahPembelian < pembelians.length) {
                        pembelians[jumlahPembelian] = barangs[i];
                        jumlahPembelian++;
                        barangs[i].stok--;
                        System.out.println("Pembelian berhasil: " + barangs[i].nama);
                    } else {
                        System.out.println("Keranjang pembelian penuh!");
                    }
                } else {
                    System.out.println("Stok habis untuk barang: " + barangs[i].nama);
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }

    public void tampilkanPembelian() {
        System.out.printf("%-10s %-20s %-15s%n", "Kode", "Nama", "Harga");
        System.out.println("==================================================================");
        for (int i = 0; i < jumlahPembelian; i++) {
            System.out.printf("%-10s %-20s Rp%-10d%n", pembelians[i].kode, pembelians[i].nama, pembelians[i].harga);
        }
    }
}