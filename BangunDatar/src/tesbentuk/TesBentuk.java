package tesbentuk;
/**
 * @author Christian HP
 */

//Main Class
public class TesBentuk {
    public static void main(String[] args) {
        Bentuk B1 = new Bentuk();
        bujursangkar BS2 = new bujursangkar("Merah", 2);
        lingkaran L1 = new lingkaran("Kuning", 10);
        silinder S1 = new silinder("Biru", 20,10);
        System.out.println("============================================\nBentuk");
        B1.cetakInfo();
        System.out.println("============================================\nBujursangkar");
        BS2.cetakInfo();
        System.out.println("============================================\nLingkaran");
        L1.cetakInfo();
        System.out.println("============================================\nSilinder");
        S1.cetakInfo();
        System.out.println("============================================\n");
    }
    
}

//Class Bentuk
class Bentuk{
    private String warna;
    public Bentuk(){
        warna= "putih";
    }
    public Bentuk (String wn){
        warna = wn;
    }
    public String getWarna(){
        return warna;
    }
    public void cetakInfo(){
        System.out.println("Bentuk Berwarna : "+ getWarna());
    }
}

//Class Bujursangkar
class bujursangkar extends Bentuk{
    private double sisi;
    public bujursangkar(){
        sisi=0;
    }
    public double getSisi(){
        return sisi;
    }
    public bujursangkar(String wn, double ss){
        super(wn);
        sisi=ss;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Sisi : "+ getSisi());
    }
}

//Class Lingkaran
class lingkaran extends Bentuk{
    private double radius;
    private double PHI= 3.14;
    public lingkaran(String wn, double r){
        super(wn);
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double hitungLuas(){
        return PHI*radius*radius;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Radius : "+getRadius()+"\nLuas : "+hitungLuas());
    }
}

//Class Silinder
class silinder extends lingkaran{
    private double tinggi;
    public silinder(String wn, double radius, double t){
        super(wn,radius);
        tinggi = t;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double hitungVolume(){
        return hitungLuas()*tinggi;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Tinggi : " +getTinggi()+"\nVolume : "+hitungVolume());
    }
}