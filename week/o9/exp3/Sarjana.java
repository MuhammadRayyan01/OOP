package week.o9.exp3;

public class Sarjana extends Mahasiswa implements IBerprestasi{
public Sarjana(String nama){
   super(nama);
}
@Override 
    public void menjuaraiKompetisi(){
        System.out.println(" i won an competition");
    }
@Override 
    public void membuatPublikasiIlmiah(){
        System.out.println("i made a good publication");
    }
}