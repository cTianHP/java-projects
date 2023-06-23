package akarpersamaankuadrat;
import java.util.Scanner;

public class AkarPersamaanKuadrat {

    public static void main(String[] args) {
        int a,b,c,D;
        double x,x1,x2;
        System.out.println("PROGRAM MENCARI AKAR DARI PERSAMAAN KUADRAT");
        System.out.println("-------------------------------------------");
        System.out.println("contoh persamaan kuadrat: ax^2 + bx + c = 0 ");
        Scanner input =new Scanner(System.in);
        System.out.print("Input a : ");
        a=input.nextInt();
        System.out.print("Input b : ");
        b=input.nextInt();
        System.out.print("Input c : ");
        c=input.nextInt();
        System.out.println("Persamaan Kuadrat: " +a+"x^2"+" + "+b+"x"+" + "+c+" = 0" );
        D=b*b-4*a*c;
        if(D>0){
            x1=(-1*b+Math.pow(D,0.5))/(2*a) ;
            x2=(-1*b-Math.pow(D,0.5))/(2*a) ;
            System.out.println("Persamaan Kuadrat memiliki 2 akar penyelesaian real:");
            System.out.println(String.format("x1 = %.2f",x1));
            System.out.println(String.format("x2 = %.2f",x2));
        }else if(D==0){
            x=(-1*b)/(2*a);
            System.out.println("Persamaan Kuadrat memiliki 1 akar penyelesaian real:");
            System.out.println(String.format("x = %.2f",x));
        }else{
            System.out.println("Persamaan Kuadrat tidak memiliki akar penyelesaian real");
        }
    }     
}
