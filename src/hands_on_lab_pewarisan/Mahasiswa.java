/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hands_on_lab_pewarisan;

/**
 *
 * @author satmaxt
 */
public class Mahasiswa extends Manusia {
    
    private String nim, namaUniversitas;
    
    public Mahasiswa(String nim, String namaUniversitas, Manusia manusia) {
        super(manusia.getNama(), manusia.getUmur());
        this.nim = nim;
        this.namaUniversitas = namaUniversitas;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaUniversitas() {
        return namaUniversitas;
    }

    public void setNamaUniversitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
    }
    
}
