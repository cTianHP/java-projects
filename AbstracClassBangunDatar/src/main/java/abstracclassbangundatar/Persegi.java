package abstracclassbangundatar;

public class Persegi extends Bentuk2D {
    private double panjang;
    private double lebar;
    public Persegi(){
        panjang= 0;
        lebar = 0;
    }
    
    public Persegi(double p,double l,String w){
        super(w);
        panjang = p;
        lebar = l;
    }
    
    public double hitungLuas(){
        return panjang*lebar;
    }
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }
    
}
