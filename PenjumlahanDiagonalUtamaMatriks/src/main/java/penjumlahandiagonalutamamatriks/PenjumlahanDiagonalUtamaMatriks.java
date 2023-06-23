package penjumlahandiagonalutamamatriks;
import java.util.Scanner;

public class PenjumlahanDiagonalUtamaMatriks {

    public static void main(String[] args) {
        //input ukuran matriks
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Jumlah Suku pada Diagonal Utama Matriks Persegi");
        System.out.println("Input Ukuran Matriks n x n");
        System.out.print("Input n = ");
        int n=input.nextInt();
        while(n<1){
            System.out.println("Input Tidak Boleh 0 atau NEGATIF!!");
            System.out.print("Input n = ");
            n=input.nextInt();
        }
        System.out.println("Matriks yang diinputkan berukuran: "+n+"x"+n);
        double[][] m = new double[n][n];
        
        //input  suku-suku matriksnya
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int a = i+1;
                int b = j+1;
                System.out.print("Input suku [" +a+","+b+ "] :");
                m[i][j] = input.nextDouble();
            }
        }
        
        //print matriksnya
        System.out.println("Matriks "+n+"x"+n+" yang diinput: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("  "+m[i][j] + " ");
            }
            System.out.println();
        }
        
        //menghitung jumlah suku diagonal utama matriks
        System.out.println("Jumlah seluruh suku di Diagonal Utama Matriks adalah " +
            PenjumlahanDiagonalUtama(m));
    }
    
    public static double PenjumlahanDiagonalUtama(double[][] m) {
        double Total = 0;
        for (int i = 0; i < m.length; i++) {
            Total += m[i][i];
        }
        return Total;
    }
}