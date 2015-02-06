package praktikum1;

import javax.swing.JOptionPane;

public class KondisiSwitchCase {

    public static void main(String[] args) {
        String menu;
        String menuPilihan;

        menu = "Kusuma Foods ! \n"
                + "1. Bakso Jumbo \n"
                + "2. Nasi Goreng \n"
                + "3. Mie Ayam Ceker \n"
                + "4. Mie Ayam Ceker Bakso"
                + "\n\n"
                + "Masukan Menu ID Pilihan Anda [1-4] :";

        menuPilihan = JOptionPane.showInputDialog(menu);
        //proses pengecekan kondisi menu pilihan
        //dengan Menu yang ada
        switch (menuPilihan) {
            case "1":
                JOptionPane.showMessageDialog(null, "Bakso Jumbo");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Nasi Goreng");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Mie Ayam Ceker");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Mie Ayam Ceker Bakso");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Menu Kosong Bro!");
        }

    }

}
