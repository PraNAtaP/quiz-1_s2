import java.util.Scanner;

public class MainBarang {
    public static void main(String[] args) {
        TransaksiBarang transaksi = new TransaksiBarang(10, 10); 
        Scanner scanner = new Scanner(System.in);
        
        transaksi.tambahBarang(new Barang19("TDR3000", "Gitar Elektrik", 2000000, 5));
        transaksi.tambahBarang(new Barang19("TDR4000", "Bass", 2000000, 5));
        transaksi.tambahBarang(new Barang19("TDR5000", "Keyboard Piano", 7000000, 3));
        transaksi.tambahBarang(new Barang19("TDR6000", "Drum Set", 8000000, 2));
        transaksi.tambahBarang(new Barang19("TDR7000", "Sound System", 5000000, 10));

        int pilihan;
        do {
            System.out.println("=================================");
            System.out.println("BAKUL ALAT MUSIK PRANATA JAYA");
            System.out.println("=================================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih[1-4]: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    transaksi.tampilkanBarang();
                    System.out.print("Masukkan kode barang: ");
                    String kode = scanner.next();
                    transaksi.beliBarang(kode);
                    System.out.print("Apakah akan belanja kembali (Y/N)? ");
                    String lanjut = scanner.next();
                    while (lanjut.equalsIgnoreCase("Y")) {
                        System.out.print("Masukkan kode barang: ");
                        kode = scanner.next();
                        transaksi.beliBarang(kode);
                        System.out.print("Apakah akan belanja kembali (Y/N)? ");
                        lanjut = scanner.next();
                    }
                    break;
                case 3:
                    transaksi.tampilkanPembelian();
                    break;
                case 4:
                    System.out.println("Terima kasih telah berbelanja!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}