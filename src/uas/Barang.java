package uas;

/**
 *
 * @author Jneferboy
 */
public class Barang {
    private String kdBarang;
    private String nmBarang;
    private double harga;
    private final String[][] dataBarang={
        {"B01","RINSO","5000"},
        {"B02","GULA","12000"},
        {"B03","MINYAK GORENG","15000"},
        {"B04","LUAK WHITE COFFEE","12000"}
    };

    public String getKdBarang() {
        return kdBarang;
    }

    public void setKdBarang(String kdBarang) {
        this.kdBarang = kdBarang;
    }

    public String getNmBarang() {
        return nmBarang;
    }

    public void setNmBarang(String nmBarang) {
        this.nmBarang = nmBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String[][] getDataBarang() {
        return dataBarang;
    }
   
    
}
