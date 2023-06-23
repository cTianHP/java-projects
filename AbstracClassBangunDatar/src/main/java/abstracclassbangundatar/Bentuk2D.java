package abstracclassbangundatar;

public abstract class Bentuk2D {
    private String warna;
    protected Bentuk2D(){
        warna = "transparan";
    }
    protected Bentuk2D(String w){
        warna = w;
    }
    public void setWarna(String w){
        warna = w;
    }
    public String getWarna(){
        return warna;
    }
    
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
    public void info(){
        System.out.println("Warna benda : " + getWarna());
        System.out.println("Luas Benda : "+hitungLuas());
        System.out.println("Hitung Keliling : "+ hitungKeliling());
    }
}
