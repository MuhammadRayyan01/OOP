

public class PascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi {
    public PascaSarjana( String nama){
    super(nama);
    }
    @Override 
    public void lulus(){
         System.out.println("i graduated with honors"); 
    }
    @Override 
    public void meraihIPKTertinggi(){ 
        System.out.println("i achieved the highest GPA"); 

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
