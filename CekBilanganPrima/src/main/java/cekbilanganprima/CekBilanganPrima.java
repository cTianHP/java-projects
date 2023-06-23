package cekbilanganprima;

import javax.swing.JOptionPane;
public class CekBilanganPrima {
    //Dengan Library JOptionPane
        public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Program Untuk Menentukan Apakah Bilangan yang Diinputkan Adalah Bilangan Prima");
        String n = JOptionPane.showInputDialog("Input Bilangan Bulat Positif Lebih dari atau Sama dengan Dua:");
        int N = Integer.parseInt(n);
        while(N<2){
            JOptionPane.showMessageDialog(null, "Input Tidak Sesuai");
            n = JOptionPane.showInputDialog("Input Bilangan Bulat Positif Lebih dari atau Sama dengan Dua:");
            N = Integer.parseInt(n);           
        }
        if(isPrime(N)){
            JOptionPane.showMessageDialog(null, "Bilangan Tersebut Adalah Bilangan Prima");
        }
        else{
            JOptionPane.showMessageDialog(null, "Bilangan Tersebut Bukan Bilangan Prima");
        }
    }
    
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false; 
            }
        }
        return true; 
    }
}
