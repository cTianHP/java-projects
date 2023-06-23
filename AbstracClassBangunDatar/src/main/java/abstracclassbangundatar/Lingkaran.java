package abstracclassbangundatar;

public class Lingkaran extends Bentuk2D {
    private double jari;
    public Lingkaran(){
        super();
        jari=0;
    }
    
    public Lingkaran(double r,String w){
        super(w);
        jari =r;
    }
    
    public double hitungLuas(){return Math.PI*jari*jari;}
    
    public double hitungKeliling(){return 2*Math.PI*jari;}
}
