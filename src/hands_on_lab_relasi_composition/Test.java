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
public class Test {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("BMW");
        Roda roda = new Roda("BridgeStone");
        
        mobil.setRoda(roda);
        
        System.out.println(mobil.getMerekMobil());
        System.out.println(mobil.getRoda().getMerekRoda());
    }
}
