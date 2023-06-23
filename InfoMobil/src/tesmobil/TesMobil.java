package tesmobil;
/**
 * @author Christian HP
 */
public class TesMobil {
    public static void main(String[] args) {
        Mobil Mobil1 = new Mobil();
        Mobil Mobil2 = new Mobil();
        Mobil Mobil3 = new Mobil();
        Mobil Mobil4 = new Mobil();
        
        //set info Mobil 1
        Mobil1.setMerk("Toyota");
        Mobil1.setWarna("Biru");
        Mobil1.setJenis("Minibus");
        Mobil1.setCC(2000);
        Mobil1.setJumlahArmada(7);
        
        //set info Mobil 2
        Mobil2.setMerk("Daihatsu");
        Mobil2.setWarna("Hitam");
        Mobil2.setJenis("Pick Up");
        Mobil2.setCC(1500);
        Mobil2.setJumlahArmada(2);
        
        //set info Mobil 3
        Mobil3.setMerk("Suzuki");
        Mobil3.setWarna("Silver");
        Mobil3.setJenis("SUV");
        Mobil3.setCC(1800);
        Mobil3.setJumlahArmada(5);
        
        //set info Mobil 4
        Mobil4.setMerk("Honda");
        Mobil4.setWarna("Merah");
        Mobil4.setJenis("Sedan");
        Mobil4.setCC(1300);
        Mobil4.setJumlahArmada(5);
        
        //Menampilkan Info
        System.out.println("Informasi Mobil 1");
        Mobil1.infoMobil();
        System.out.println("Informasi Mobil 2");
        Mobil2.infoMobil();
        System.out.println("Informasi Mobil 3");
        Mobil3.infoMobil();
        System.out.println("Informasi Mobil 4");
        Mobil4.infoMobil();
    }
}
