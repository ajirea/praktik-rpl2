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
public class Persegi implements BangunDatar {
    private double sisi;
    
    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        System.out.println(sisi*sisi);
    }

    @Override
    public void hitungKeliling() {
        System.out.println(sisi*4);
    }
}
