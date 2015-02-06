

package praktikum6;

import javax.swing.JOptionPane;

public class ArraySatuDimensi {
    public static void main(String[] args) {
        
        int[] isiArr={10,2,5,3,8};
        int i;
        
        //JOptionPane.showMessageDialog(null, "Isi array pada index ke 3 : "+isiArr[3]);
        String cari;
        int ditemukan=0;
        int ket=0;
        cari=JOptionPane.showInputDialog("Masukan data yang anda cari ");
        
        for(i=0;i<isiArr.length;i++){
            
            if(cari.equalsIgnoreCase(String.valueOf(isiArr[i]))){
                ditemukan=i;
                ket=1;
                break;
            }  
            
            
        }
        
        
        if(ket==0){
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan !");
        }else{
            JOptionPane.showMessageDialog(null, "Data ditemukan ! pada index ke : "+ditemukan);
        }
        
        
      
        
        
        
        
        
        
    }
    
}
