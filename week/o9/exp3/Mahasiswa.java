package week.o9.exp2;

public class Mahasiswa {
    protected String Nama;
    
    public Mahasiswa (String nama){
        this.Nama = nama;
    }

    public  void kuliahDiKampus(){
        System.out.println("i am student, my name is "+ this.Nama);
        System.out.println("i attend classes on campus");
    }
    
}
