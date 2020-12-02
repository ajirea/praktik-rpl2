package hands_on_lab_abstract_class;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satma
 */
public class Test {
    
    public static void main(String[] args) {
        double sisi,panjang,lebar;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Sisi\t: "); sisi = sc.nextDouble();
        System.out.print("Masukkan Panjang\t: "); panjang = sc.nextDouble();
        System.out.print("Masukkan Lebar\t: "); lebar = sc.nextDouble();
        
        Persegi persegi = new Persegi(sisi);
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        
        Persegi.siapaKamu();
        persegi.hitungLuas();
        persegi.hitungKeliling();
        
        PersegiPanjang.siapaKamu();
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
    }
    
}
