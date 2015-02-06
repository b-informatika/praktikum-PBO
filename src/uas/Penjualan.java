package uas;

import javax.swing.JOptionPane;

/**
 *
 * @author Jneferboy
 */
public class Penjualan extends Barang{
    private int jumlahBeli;

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
    
    public void cariBarang(String kdBarang){
        int sk=0,ik=0;
        
        for(int i=0;i<getDataBarang().length;i++){
            if(kdBarang.equalsIgnoreCase(getDataBarang()[i][0])){
                ik=i;
                sk=1;
                break;
            }   
        }
        if(sk==1){
            JOptionPane.showMessageDialog(null, "Data Ditemukan !");
            this.setKdBarang(getDataBarang()[ik][0]);
            this.setNmBarang(getDataBarang()[ik][1]);
            this.setHarga(Double.valueOf(getDataBarang()[ik][2]));
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
        }
        
    }
    
    public double getTotalHarga(){
        return this.jumlahBeli*this.getHarga();
    }
    
}
