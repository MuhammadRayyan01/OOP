
public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
public Sarjana(String nama){
   super(nama);
}
@Override 
 public void lulus() { 
 System.out.println("I have completed my UNDERGRADUATE THESIS");  
} 
@Override 
 public void meraihIPKTertinggi() { 
System.out.println("My GPA is above 3.51"); 
 }

 @Override 
    public void menjuaraiKompetisi(){
        System.out.println(" i won an competition");
    }
@Override 
    public void membuatPublikasiIlmiah(){
        System.out.println("i made a won a national publish journal");
    }
}