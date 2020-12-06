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
public class Buku {
    private String judulBuku;
    private RakBuku rakBuku;
    
    public Buku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public RakBuku getRakBuku() {
        return rakBuku;
    }

    public void setRakBuku(RakBuku rakBuku) {
        this.rakBuku = rakBuku;
    } 
}
