package week.o9.exp3;

public class Sarjana extends Mahasiswa implements ICumlaude{
public Sarjana(String nama){
   super(nama);
}
    public void lulus(){
    System.out.println("i have completed my undergraduate thesis");
    }
    public void meraihIPKTertinggi(){
    System.out.println("my gpa is above 3.51");
    }
}
