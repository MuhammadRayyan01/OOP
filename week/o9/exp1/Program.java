package week.o9.exp1;

public class Program {
    public static void main(String[] args) {

        //Hewan hewan = new Hewan();
        
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);

        ani.ajakPeliharaanJalan();
        budi.ajakPeliharaanJalan();
    }
    
}
