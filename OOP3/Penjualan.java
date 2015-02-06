/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP3;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jnefer
 */
public class Penjualan extends Barang implements Interface {
    
    private AppPenjualan form;
    
    private int jumlah;
    
    //setForm
    public void setForm(AppPenjualan form){
        this.form=form;
    }
    

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void input() {
        setNmBarang(form.gettNmBrg().getText());
        //penanganan error kesalahan pada inputan double
        try {
            setHrgBarang(Double.valueOf(form.gettHarga().getText()));
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inputan bukan angka ! \n"+e.getMessage());
        }
        //penanganan error kesalahan pada inputan int
        try {
            setJumlah(Integer.valueOf(form.gettJumlah().getText()));
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inputan bukan angka ! \n"+e.getMessage());
        }
  
    }

    @Override
    public double totalHarga() {
        return this.getHrgBarang() * this.getJumlah();
    }

    public void cetakStruk() {
        String struk = "Struk Penjualan :\n"
                + "Nama Barang\tHarga Barang\tJumlah Beli\tTotal Harga\n";
        struk += this.getNmBarang() + "\t\t" + this.getHrgBarang() + "\t\t" + this.getJumlah()
                + "\t\t" + this.totalHarga();
        //cetak struk
        //JOptionPane.showMessageDialog(null, struk);
        //System.out.println(struk);
        form.gettNota().setText(struk);
    }

}
