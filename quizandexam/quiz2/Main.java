package quizandexam.quiz2;

public class Main {
    public static void main(String[] args) {
        
    Gatotkaca g = new Gatotkaca("gatots", 99);
    CaptainIndonesia ci = new CaptainIndonesia("Caps", 77);

    g.attack(new Evil());
    ci.attack(new Evil());
    ci.attack(new Villain());

    }
}
