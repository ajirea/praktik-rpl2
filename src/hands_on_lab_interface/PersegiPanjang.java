package hands_on_lab_interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satma
 */
public class PersegiPanjang implements BangunDatar {
    private double panjang;
    private double lebar;
    
    PersegiPanjang (double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitungLuas() {
        System.out.println(panjang*lebar);
    }

    @Override
    public void hitungKeliling() {
        System.out.println((panjang+lebar)*2);
    }
}
