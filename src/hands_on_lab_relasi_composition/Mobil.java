/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hands_on_lab_relasi_composition;

/**
 *
 * @author satmaxt
 */
public class Mobil {
    private String merekMobil;
    private Roda roda;
    
    public Mobil(String merekMobil) {
        this.merekMobil = merekMobil;
    }

    public String getMerekMobil() {
        return merekMobil;
    }

    public void setMerekMobil(String merekMobil) {
        this.merekMobil = merekMobil;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }
    
    
}
