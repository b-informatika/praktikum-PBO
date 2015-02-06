/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP2;

public class Pegawai extends SuperClass{
    private String kdPegawai;

    public Pegawai() {
    }

    public String getKdPegawai() {
        return kdPegawai;
    }

    public void setKdPegawai(String kdPegawai) {
        this.kdPegawai = kdPegawai;
    }
    
    public static void main(String[] args) {
        Pegawai pg=new Pegawai();
        pg.setNama("Erlan");
    }
    
}
