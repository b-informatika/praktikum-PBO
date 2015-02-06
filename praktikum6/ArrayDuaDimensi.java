package praktikum6;

import javax.swing.JOptionPane;

public class ArrayDuaDimensi {

    public static void main(String[] args) {
        int i;
        String cari;
        int index = 0;
        int ket = 0;
        String kodeBarang;
        String namaBarang;
        double harga;
        int jumlahBeli, stok;
        double totalHarga, totalBayar, diskon, uangDiterima, uangKembali;

        String[][] dataBarang = {
            //0      1       2
            {"BR001", "PRINTER HP D2000", "270000", "10"},
            {"BR002", "PRINTER CANON MP238", "540000", "10"},
            {"BR003", "SMARTFREN MODEM", "200000", "20"},
            {"BR004", "SANDISK FLASH DISK 8 GB", "57000", "50"}

        };
        //proses pencarian
        cari = JOptionPane.showInputDialog("Masukan kode barang :");
        //b,k
        for (i = 0; i < dataBarang.length; i++) {

            if (cari.equalsIgnoreCase(dataBarang[i][0])) {
                index = i;
                ket = 1;
                break;
            }
        }
        if (ket == 1) {
            //proses pengambilan data yang ditemukan ke var array
            kodeBarang = dataBarang[index][0];
            namaBarang = dataBarang[index][1];
            harga = Double.valueOf(dataBarang[index][2]);
            stok = Integer.valueOf(dataBarang[index][3]);

            jumlahBeli = Integer.valueOf(JOptionPane.showInputDialog("Jumlah Beli :"));

            totalHarga = harga * jumlahBeli;//proses penghitungan total bayar
            if (totalHarga >= 500000) {
                diskon = 0.1 * totalHarga;
            } else {
                diskon = 0;
            }

            stok -= jumlahBeli;
            totalBayar = totalHarga - diskon;
            uangDiterima = Double.valueOf(JOptionPane.showInputDialog("Total Bayar : " + totalBayar + "\n Masukan jumlah uang yang diterima : "));
            uangKembali = uangDiterima - totalBayar;
            //pembuatan struk pembelian
            String struk
                    = "Kode Barang : " + kodeBarang + "\n"
                    + "Nama Barang   : " + namaBarang + "\n"
                    + "Harga         : " + harga + "\n"
                    + "Jumlah beli   : " + jumlahBeli + "\n"
                    + "Sisa stok     : " + stok + "\n"
                    + "Total harga   : " + totalHarga + "\n"
                    + "Diskon        : " + diskon + "\n"
                    + "Total Bayar   : " + totalBayar + "\n"
                    + "Uang diterima : " + uangDiterima + "\n"
                    + "Uang kembali  : " + uangKembali + "\n";
            JOptionPane.showMessageDialog(null, struk);//proses pencetakan struk pembelian
        } else {
            JOptionPane.showMessageDialog(null, "Data barang tidak ditemukan !");
        }

    }
}
