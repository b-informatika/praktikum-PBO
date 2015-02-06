package praktikum3;
import javax.swing.JOptionPane;

public class InputOutputJOPane {

    public static void main(String[] args) {
        int alas, tinggi;
        double hasil;
        
        
        alas=Integer.valueOf(JOptionPane.showInputDialog("Masukan Alas :"));
        tinggi=Integer.valueOf(JOptionPane.showInputDialog("Masukan Tinggi :"));
        
        hasil=(alas*tinggi)/2;
        
        JOptionPane.showMessageDialog(null, "Hasil Perhitungan Luas Segitiga : "+(int)hasil+" cm");
        
        
        
    }

}
