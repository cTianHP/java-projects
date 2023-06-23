import java.util.Scanner;

public class Suhu{
    public static void main(String[] args) {
        double Celcius,Farenheit,Reamur,Kelvin;
        System.out.println("PROGRAM KONVERSI SUHU");
        System.out.println("=============================");
        System.out.println("Ketik Nomor Suhu Awal yang akan Dikonversi");
        System.out.println("1.Celcius");
        System.out.println("2.Farenheit");
        System.out.println("3.Kelvin");
        System.out.println("4.Reamur");
        System.out.println("*contoh jika ingin konversi suhu celcius ke suhu lainnya, ketik: 1");
        System.out.println("-----------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Pilih: ");
        int pilih = input.nextInt();
        while(pilih!=1 && pilih!=2 && pilih!=3 && pilih!=4){
            System.out.println("Input pilih salah, ketik: 1 atau 2 atau 3 atau 4");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
        }
        if(pilih == 1){
            System.out.print("Input suhu dalam celcius: ");
            Celcius = input.nextDouble();
            System.out.println("Suhu dalam Celcius = "+Celcius);
            Farenheit = (Celcius*9)/5+32;
            Kelvin = Celcius + 273;
            Reamur = (Celcius*4)/5;
            System.out.println("Konversi Suhu dalam:");
            System.out.println("1.Farenheit = "+Farenheit);
            System.out.println("2.Kelvin = "+Kelvin);
            System.out.println("3.Reamur = "+Reamur);
            System.out.println("=============================");
            System.out.println("PROGRAM SELESAI");
        }
        //Farenheit
        else if(pilih == 2){
            System.out.print("Input suhu dalam farenheit: ");
            Farenheit = input.nextDouble();
            System.out.println("Suhu dalam Farenheit = "+Farenheit);
            Celcius = ((Farenheit-32)*5)/9;
            Kelvin = Celcius + 273;
            Reamur = ((Farenheit-32)*4)/9;
            System.out.println("Konversi Suhu dalam:");
            System.out.println("1.Celcius = "+Celcius);
            System.out.println("2.Kelvin = "+Kelvin);
            System.out.println("3.Reamur = "+Reamur);
            System.out.println("=============================");
            System.out.println("PROGRAM SELESAI");
        }

        //Kelvin
        else if(pilih == 3){
            System.out.print("Input suhu dalam kelvin: ");
            Kelvin = input.nextDouble();
            System.out.println("Suhu dalam Kelvin = "+Kelvin);
            Celcius = (Kelvin-273.0);
            Farenheit = ((Kelvin - 273)*9)/5 +32;
            Reamur = ((Kelvin - 273)*4)/5;
            System.out.println("Konversi Suhu dalam:");
            System.out.println("1.Celcius = "+Celcius);
            System.out.println("2.Farenheit = "+Farenheit);
            System.out.println("3.Reamur = "+Reamur);
            System.out.println("=============================");
            System.out.println("PROGRAM SELESAI");
        }
        //Reamur   
        else if(pilih == 4){
            System.out.print("Input suhu dalam reamur: ");
            Reamur = input.nextDouble();
            System.out.println("Suhu dalam Reamur = "+Reamur);
            Celcius = (Reamur*5)/4;
            Farenheit = ((Reamur*9)/4) +32;
            Kelvin = (Reamur*5)/4 +273;
            System.out.println("Konversi Suhu dalam:");
            System.out.println("1.Celcius = "+Celcius);
            System.out.println("2.Kelvin = "+Kelvin);
            System.out.println("3.Farenheit = "+Farenheit);
            System.out.println("=============================");
            System.out.println("PROGRAM SELESAI");
        }
    }
}