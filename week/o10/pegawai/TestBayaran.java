package o10.pegawai;

public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer("Agus",800 , 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
    System.out.println("bayaran manajer: "+hr.hitungBayaran(man));
    System.out.println("bayaran programmer: "+hr.hitungBayaran(prog));
    }
    
    
}
