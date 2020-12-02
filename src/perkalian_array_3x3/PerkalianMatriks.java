/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian_array_3x3;

/**
 *
 * @author satmaxt
 */
public class PerkalianMatriks {
    
    public static void main(String[] args) {
        int[][] matriksA = {{1, 2, 3}, {5, 2, 3}, {1, 2, 5}};
        int[][] matriksB = {{6, 5, 6}, {1, 2, 3}, {4, 5, 6}};
        kali(matriksA, matriksB);
    }
    
    public static void kali(int[][] matriksA, int[][] matriksB) {
        int[][] matriksC = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriksC[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    matriksC[i][j]+=matriksA[i][k]*matriksB[k][j];      
                }
                System.out.print(matriksC[i][j]+" "); // output elemen matriks
            }
            System.out.println();
        }      
    }
}
