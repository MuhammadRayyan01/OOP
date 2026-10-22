package week.o9.exp3;

public class PascaSarjana extends Mahasiswa implements ICumlaude {
    public PascaSarjana( String nama){
    super(nama);
    }
    @Override 
    public void lulus(){
    System.out.println("I have completed my master thesis");
    }
    @Override 
    public void meraihIPKTertinggi(){
    System.out.println("my GPA is above 3.71");
    }
}
