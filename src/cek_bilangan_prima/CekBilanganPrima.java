/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cek_bilangan_prima;

/**
 *
 * @author satma
 */
public class CekBilanganPrima {
    public static void main(String[] args) {
        int angka[] = {2, 3, 5, 7, 11, 13, 17};
        
        for(int i : angka) {
            System.out.println(i + ": " + isPrime(13));
        }
    }
    
    public static Boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        else if (num == 2) {
            return true;
        }
        else if (num % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) 
        {
            if (num % i == 0) return false;
                
        }
        
        return true;
    }
}
