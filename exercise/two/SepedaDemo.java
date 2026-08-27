package exercise.two;
public class SepedaDemo{
    public static void main(String[] args) {
    Sepeda spd1 = new Sepeda();
    Sepeda spd2 = new Sepeda();

    spd1.setMerek("yamaha");
    spd1.gantiGear(1);
    spd1.tambahKecepatan(20);
    spd1.rem(10);
    spd1.cetakStatus();
    
    spd2.setMerek("honda");
    spd2.gantiGear(1);
    spd2.tambahKecepatan(40);
    spd2.rem(10);
    spd2.cetakStatus();
    
    }
}
