/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hands_on_lab_relasi_aggregation;

/**
 *
 * @author satma
 */
public class Test {
    public static void main(String[] args) {
        Buku buku = new Buku("Harry Potter");
        RakBuku rakBuku = new RakBuku("Olympic");
        
        buku.setRakBuku(rakBuku);
        
        System.out.println(buku.getRakBuku().getMerekRak());
        System.out.println(buku.getJudulBuku());
    }
}
