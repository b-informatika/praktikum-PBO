/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

/**
 *
 * @author jneferboy
 */
public class Nilai {
    private double harian,uts,uas;

    public Nilai() {
    }

    public double getHarian() {
        return harian;
    }

    public void setHarian(double harian) {
        this.harian = harian;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double hitungNA(){
        return (0.2*this.getHarian())+(0.3*this.getUts())+(0.5*this.getUas());
    }
    
}
