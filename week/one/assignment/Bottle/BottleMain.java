package week.one.assignment.Bottle;

public class BottleMain{
    public static void main(String[] args) {
    Bottle botol1= new Bottle();
    Bottle botol2= new Bottle();

    botol1.setMaterialType("plastik");
    botol1.setBottleVolume(2);
    botol1.setBottleCap(true);
    botol1.printInfo();

    botol2.setMaterialType("kaca");
    botol2.setBottleVolume(3);
    botol2.setBottleCap(false);
    botol2.printInfo();
    }
}