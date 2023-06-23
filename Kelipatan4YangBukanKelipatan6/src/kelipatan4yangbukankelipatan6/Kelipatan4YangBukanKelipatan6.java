package kelipatan4yangbukankelipatan6;
import java.util.Scanner;
public class Kelipatan4YangBukanKelipatan6 {
    public static void main(String[] args) {
        int Bilangan,a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        Bilangan = input.nextInt();
        a = Bilangan % 4;
        b = Bilangan % 6;
        if (a==0 && b!=0){
            System.out.println("Bilangan "+ Bilangan + " merupakan kelipatan 4"
            + " yang bukan kelipatan 6");           
        } else if (a==0 && b==0){
            System.out.println("Bilangan "+ Bilangan + " merupakan " +
            "kelipatan 4 dan 6");
        } else if (a!=0 && b==0){
            System.out.println("Bilangan "+ Bilangan + " merupakan " +
            "kelipatan 6");
        } else if (a!=0 && b!=0){
            System.out.println("Bilangan "+ Bilangan + " bukan merupakan " +
            "kelipatan 4 dan 6");
        }      
        
    }    
}
