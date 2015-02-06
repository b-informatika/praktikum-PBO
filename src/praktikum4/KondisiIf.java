package praktikum4;

import javax.swing.JOptionPane;

public class KondisiIf {

    public static void main(String[] args) {

        double harian, uts, uas, nilaiAkhir;
        String grade;

        harian = Double.valueOf(JOptionPane.showInputDialog("Masukan Nilai Harian :"));
        uts = Double.valueOf(JOptionPane.showInputDialog("Masukan Nilai UTS :"));
        uas = Double.valueOf(JOptionPane.showInputDialog("Masukan Nilai UAS :"));

        nilaiAkhir = (0.2 * harian) + (0.3 * uts) + (0.5 * uas);

        if (nilaiAkhir >= 90) {
            grade = "A";
        } else if (nilaiAkhir >= 80) {
            grade = "B+";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 60) {
            grade = "C+";
        } else if (nilaiAkhir >= 50) {
            grade = "C";
        } else if (nilaiAkhir >= 40) {
            grade = "D";
        } else {
            grade="E";
        }
        
        JOptionPane.showMessageDialog(null, "Informasi Nilai Akhir & Grade \n"
                                      +"Nilai Akhir Anda     : "+nilaiAkhir+"\n"
                                      +"Grade Nilai Anda     : "+grade);
    }

}
