package praktikum4;

import javax.swing.JOptionPane;

public class KondisiSwitchCase {

    public static void main(String[] args) {

        String pilihan, menu;

        menu = "Daftar Menu Makanan Azmi&Iga Foods : \n"
                + "1. Bakso \n"
                + "2. Mie Ayam \n"
                + "3. Mie Ayam Bakso \n"
                + "4. Mie Ayam Bakso Ceker \n"
                + "\n\n"
                + "Masukan ID Menu Pilihan Anda [1-4]: ";

        pilihan = JOptionPane.showInputDialog(menu);

        switch (pilihan) {
            case "1":
                JOptionPane.showMessageDialog(null, "Anda Memilih Bakso");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Anda Memilih Mie Ayam");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Anda Memilih Mie Ayam Bakso");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Anda Memilih Mie Ayam Bakso Ceker");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Menu Yang Anda Pilih Tidak Ada !");

        }

    }
}
