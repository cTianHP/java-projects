package operasiarray1d;
import java.util.*;
public class OperasiArray1D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input banyak elemen dalam Array: ");
        int a = input.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Array1\n-----------------");
        int Array1[] = new int[a];
        for(int i=0;i<Array1.length;i++){
            System.out.println("Input elemen index ke - "+i);
            System.out.print("Array1["+i+"] = ");
            Array1[i] = input.nextInt();
        }
        System.out.println("Array1 = "+Arrays.toString(Array1));
     
        System.out.println();
        System.out.println("Array2\n-----------------");
        int Array2[] = new int[a];
        for(int i=0;i<Array2.length;i++){
            System.out.println("Input elemen index ke - "+i);
            System.out.print("Array2["+i+"] = ");
            Array2[i] = input.nextInt();
        }
        System.out.println("Array2 = "+Arrays.toString(Array2));
        System.out.println("---------------------------------");
        System.out.println("Array1 = "+ Arrays.toString(Array1));
        System.out.println("Array2 = "+ Arrays.toString(Array2));
        int ArrayHasil1[]= PenjumlahanArray(Array1,Array2);
        System.out.println("Hasil Penjumlahan Kedua Array = " + Arrays.toString(ArrayHasil1));
        int ArrayHasil2[]= PenguranganArray(Array1,Array2);
        System.out.println("Hasil Pengurangan Kedua Array = " + Arrays.toString(ArrayHasil2));
        int ArrayHasil3[]= PerkalianArray(Array1,Array2);
        System.out.println("Hasil Perkalian Kedua Array = " + Arrays.toString(ArrayHasil3));
        System.out.println("-----------------------------------------------------");  
    }
            
    public static int[] PenjumlahanArray(int ArrayInt1[],int ArrayInt2[]){
        int ArrayHasil[]= new int[ArrayInt1.length];
        for(int i=0; i < ArrayInt1.length; i++){
        ArrayHasil[i]=ArrayInt1[i]+ArrayInt2[i];
        }
        return ArrayHasil;
    }    
    public static int[] PenguranganArray(int ArrayInt1[],int ArrayInt2[]){
        int ArrayHasil[]= new int[ArrayInt1.length];
        for(int i=0; i < ArrayInt1.length; i++){
        ArrayHasil[i]=ArrayInt1[i]-ArrayInt2[i];
        }
        return ArrayHasil;
    }
    public static int[] PerkalianArray(int ArrayInt1[],int ArrayInt2[]){
        int ArrayHasil[]= new int[ArrayInt1.length];
        for(int i=0; i < ArrayInt1.length; i++){
        ArrayHasil[i]=ArrayInt1[i]*ArrayInt2[i];
        }
        return ArrayHasil;
    }
}
