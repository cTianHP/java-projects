package perkalianduamatriks;
import java.util.Scanner;

public class PerkalianDuaMatriks {

    public static void main(String[] args) {
        //input ukuran matriks A dan B 
        Scanner input = new Scanner(System.in);
        System.out.println("Input Ukuran Matriks A");
        System.out.print("Input banyaknya baris Matriks A: ");
        int a = input.nextInt();
        while(a<1){
            System.out.println("Input Tidak Boleh 0 atau NEGATIF!!");
            System.out.print("Input banyaknya baris Matriks A: ");
            a=input.nextInt();
        }
        System.out.print("Input banyaknya kolom Matriks A: ");
        int b = input.nextInt();
        while(b<1){
            System.out.println("Input Tidak Boleh 0 atau NEGATIF!!");
            System.out.print("Input banyaknya kolom Matriks A: ");
            b=input.nextInt();
        }
        System.out.println("Input Ukuran Matriks B");
        System.out.print("Input banyaknya baris Matriks B: ");
        int c = input.nextInt();
        while(c<1){
            System.out.println("Input Tidak Boleh 0 atau NEGATIF!!");
            System.out.print("Input banyaknya baris Matriks B: ");
            c=input.nextInt();
        }
        System.out.print("Input banyaknya kolom Matriks B: ");
        int d = input.nextInt();
        while(d<1){
            System.out.println("Input Tidak Boleh 0 atau NEGATIF!!");
            System.out.print("Input banyaknya kolom Matriks B: ");
            d=input.nextInt();
        }
        double[][] matriksA = new double[a][b];
        double[][] matriksB = new double[c][d];
        System.out.println("Matriks Pertama yang diinputkan berukuran: "+a+"x"+b);
        System.out.println("Matriks Kedua yang diinputkan berukuran: "+c+"x"+d);
        
        //cek apakah kedua matriks bisa dikalikan
        if(b!=c){
            System.out.println("Perkalian Matriks Antara Matriks A dan Matriks B Tidak Dapat Dilakukan");
            System.out.println("Pastikan Jumlah Kolom Matriks A = Jumlah Baris Matriks B Agar Perkalian Matriks Dapat Dilakukan");
        }
        else{
            //input suku-suku matriks A
            System.out.println("Input Nilai-Nilai Matriks A");
            for (int i = 0; i < matriksA.length; i++) {
                for (int j = 0; j < matriksA[i].length; j++) {
                    int p = i+1;
                    int q = j+1;
                    System.out.print("Input suku [" +p+","+q+ "] :");
                    matriksA[i][j] = input.nextDouble();
                }
            }
            //print matriks A
            System.out.println("Matriks A yang diinput: ");
            for (int i = 0; i < matriksA.length; i++) {
                for (int j = 0; j < matriksA[0].length; j++) {
                   System.out.print("  "+matriksA[i][j] + " ");
                   }
                System.out.println();
            }
            //input suku-suku matriks B
            System.out.println("Input Nilai-Nilai Matriks B");
            for (int i = 0; i < matriksB.length; i++) {
                for (int j = 0; j < matriksB[i].length; j++) {
                    int p = i+1;
                    int q = j+1;
                    System.out.print("Input suku [" +p+","+q+ "] :");
                    matriksB[i][j] = input.nextDouble();
                }
            }
            //print matriks B
            System.out.println("Matriks B yang diinput: ");
            for (int i = 0; i < matriksB.length; i++) {
                for (int j = 0; j < matriksB[0].length; j++) {
                   System.out.print("  "+matriksB[i][j] + " ");
                   }
                System.out.println();
            }
            
            //matriks hasil perkalian matriks A x matrix B
            double[][] MatriksC = PerkalianMatrix(matriksA, matriksB);
            System.out.println("Hasil Matriks Perkalian Martiks A x Matriks B = ");
            for (int i = 0; i < MatriksC.length; i++) {
                for (int j = 0; j < MatriksC[0].length; j++) {
                   System.out.print("  "+MatriksC[i][j] + " ");
                   }
                System.out.println();
            }
        }
    }

    public static double[][] PerkalianMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c; 
   }
}
