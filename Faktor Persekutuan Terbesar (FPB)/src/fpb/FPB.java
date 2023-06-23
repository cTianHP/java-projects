package fpb;
import java.util.Scanner;
public class FPB {
    public static void main(String[] args) {
        int a,b,c,Bil1,Bil2;
        System.out.println("Faktor Persekutuan Terbesar (FPB) dari dua bilangan bulat positif\n-----"
                + "------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Input Bilangan Bulat Positif Pertama: ");
        Bil1 = input.nextInt();
        while(Bil1 <1){
            System.out.println("Tidak Boleh Input Bilangan Bulat Negatif dan 0 !!");
            System.out.print("Input Bilangan Bulat Positif Pertama: ");
            Bil1 = input.nextInt();
        }
        System.out.print("Input Bilangan Bulat Positif Kedua: ");
        Bil2 = input.nextInt();
        while(Bil2 <1){
            System.out.println("Tidak Boleh Input Bilangan Bulat Negatif dan 0 !!");
            System.out.print("Input Bilangan Bulat Positif Kedua: ");
            Bil2 = input.nextInt();
        }
        a = Bil1;
        b = Bil2;
        c = a % b;
        while(c!=0){
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println("Faktor Persekutuan Terbesar dari "+ Bil1 + " dan "+ Bil2+ " adalah "+ b); 
    }
}
