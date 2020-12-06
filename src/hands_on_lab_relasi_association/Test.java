/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hands_on_lab_relasi_association;

/**
 *
 * @author satmaxt
 */
public class Test {
    public static void main(String[] args) {
        Makanan makanan = new Makanan("Nasi Padang");
        Provinsi provinsi = new Provinsi("Sumatra Barat");
        
        String namaMakanan = makanan.getNamaMakanan();
        String namaProvinsi = provinsi.getNamaProvinsi();
        
        System.out.println(namaMakanan);
        System.out.println(namaProvinsi);
    }
}
