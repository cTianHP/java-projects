package pendekatanphi;
import java.util.*;

public class PendekatanPHI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG NILAI PENDEKATAN PHI\n====================================");
	int suku_1 = 1;
        System.out.print("Input banyak n: ");
	int suku_n  = input.nextInt();
	for (int n = suku_1; n <= suku_n;  n++ ) {
            System.out.print("n = " +  n);
            System.out.println("   || PHI = " + HitunganPHI(n));
	}
    }
    public static double HitunganPHI(double i) {
	double PHI = 0;	
        double n;
	for (n = 1; n <= i; n ++) {
            PHI += Math.pow(-1, n +1) / (2 * n - 1);
	}
	PHI *= 4;
	return PHI;
    }
}
