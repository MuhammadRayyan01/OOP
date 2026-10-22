package week.o9.exp1;

public class Orang {
private String Nama;
private Hewan HewanPeliharaan;

public Orang(String nama){
this.Nama=nama;
}
public void peliharaHewan(Hewan hewan){
this.HewanPeliharaan = hewan;
}
public void ajakPeliharaanJalan(){
System.out.println("my name is: " + this.Nama);
System.out.println("my pet moves by: ");
this.HewanPeliharaan.bergerak();
System.out.println("---------------------------");
}
}
