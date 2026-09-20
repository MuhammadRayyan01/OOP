package week.one;
public class BikeDemo{
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

    mountainBike1.setBrand("trek");
    mountainBike1.speedAcc(10);
    mountainBike1.gearChanges(2);
    mountainBike1.printInfo();

    mountainBike2.setBrand("Giant");
    mountainBike2.speedAcc(20);
    mountainBike2.gearChanges(3);
    mountainBike2.printInfo();

    roadBike1.setBrand("Specialized");
    roadBike1.setTireWidth(25);
    roadBike1.speedAcc(15);
    roadBike1.gearChanges(4);
    roadBike1.printInfo();
    }

}