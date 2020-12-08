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
public class Test {
    public static void main(String[] args) {
        Penumpang penumpang = new Penumpang("Budi");
        Bus bus = new Bus("10");
        
        penumpang.setBus(bus);
        
        System.out.println(penumpang.getNamaPenumpang());
        System.out.println(penumpang.getBus().getNomorBus());
    }
}
