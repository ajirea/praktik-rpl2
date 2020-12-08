/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hands_on_lab_relasi_dependency;

/**
 *
 * @author satma
 */
public class Penumpang {
    private String namaPenumpang;
    private Bus bus;
    
    public Penumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
    
    
}
