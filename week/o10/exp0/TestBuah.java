package o10.exp0;

public class TestBuah {
    public static void main(String[] args) {
        Manusia ilham = new Manusia();
        Apel myApel = new Apel();
        Pisang myPisang = new Pisang();
        ilham.makanBuah(myApel);
        System.out.println("----------------------");
        ilham.makanBuah(myPisang);
    }
}
