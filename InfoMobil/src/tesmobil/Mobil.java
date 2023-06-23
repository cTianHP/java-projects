package tesmobil;
/**
 * @author Christian HP
 */
public class Mobil {
    private String Merk,Warna,Jenis;
    private int CC,JumlahArmada;
    
    //Merk
    public void setMerk(String m){
        this.Merk = m;
    }
    public String getMerk(){
        return this.Merk;
    }
    
    //Warna
    public void setWarna(String w){
        this.Warna = w;
    }
    public String getWarna(){
        return this.Warna;
    }
    
    //Jenis
    public void setJenis(String j){
        this.Jenis = j;
    }
    public String getJenis(){
        return this.Jenis;
    }
    
    //CC
    public void setCC(int c){
        this.CC = c;
    }
    public int getCC(){
        return this.CC;
    }
    
    //JumlahArmada
    public void setJumlahArmada(int ja){
        this.JumlahArmada = ja;
    }
    public int getJumlahArmada(){
        return this.JumlahArmada;
    }
    
    //Cetak Informasi
    public void infoMobil(){
        System.out.println("Merk: " + getMerk());
        System.out.println("Warna: " + getWarna());
        System.out.println("Jenis: " + getJenis());
        System.out.println("CC: " + getCC());
        System.out.println("Jumlah Armada : " + getJumlahArmada());
        System.out.println();
    }
}
