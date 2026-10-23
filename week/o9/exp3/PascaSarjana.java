package week.o9.exp3;


public class PascaSarjana extends Mahasiswa implements IBerprestasi {
    public PascaSarjana( String nama){
    super(nama);
    }
    @Override 
    public void menjuaraiKompetisi(){
        System.out.println("i have won international competition");
    }    
    @Override 
    public void membuatPublikasiIlmiah(){
        System.out.println(" i have published in an international journal");
    }
    
}
