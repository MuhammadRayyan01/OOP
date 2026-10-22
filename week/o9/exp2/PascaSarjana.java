package week.o9.exp2;

public class PascaSarjana extends Mahasiswa implements ICumlaude {
    public PascaSarjana( String nama){
    super(nama);
    }
    @Override 
    public void menjuaraiKompetisi(){
    System.out.println(" i have won an International competition");
    }
    @Override 
    public void meraihIPKTertinggi(){
    System.out.println("my GPA is above 3.71");
    }
}
