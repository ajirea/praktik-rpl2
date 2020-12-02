package hands_on_lab_pewarisan;

import java.util.Scanner;

/**
 *
 * @author satmaxt
 */
public class Test {
    public static void main(String[] args) {
        
        
        String nim, namaUniversitas;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM\t: "); nim = sc.next();
        System.out.print("Masukkan Nama Universitas\t: "); namaUniversitas = sc.next();
 
        Manusia manusia = new Manusia("Budi", 30);

        Mahasiswa mahasiswa=new Mahasiswa(nim, namaUniversitas, manusia);
        
        System.out.println(mahasiswa.getNim()); //tampilkan nim mahasiswa
        System.out.println(mahasiswa.getNama()); //tampilkan nama mahasiswa
        System.out.println(mahasiswa.getUmur()); //tampilkan umur mahasiswa
        System.out.println(mahasiswa.getNamaUniversitas()); //tampilkan nama universitas mahasiswa
    }
}
