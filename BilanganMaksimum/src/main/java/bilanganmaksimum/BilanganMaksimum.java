package bilanganmaksimum;
import java.util.*;

public class BilanganMaksimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Bilangan 1: ");
        double bil1 = input.nextDouble();
        System.out.print("Input Bilangan 2: ");
        double bil2 = input.nextDouble();
        double c = max(bil1,bil2);
        System.out.println("Nilai maksimum dari "+bil1+" dan "+bil2+" adalah " + c);
    }   
      
    //Mencari Nilai Maksimum
    public static double max(double num1, double num2) {
        if (num1 > num2)
        return num1;
        else
        return num2;
    }
}
