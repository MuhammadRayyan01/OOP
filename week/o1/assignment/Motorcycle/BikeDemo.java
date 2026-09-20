package week.o1.assignment.Motorcycle;

public class BikeDemo{
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        Motorcycle motor1 = new Motorcycle();

    mountainBike1.setBrand("trek");
    mountainBike1.speedAcc(10);
    mountainBike1.gearChanges(2);
    mountainBike1.printInfo();

    mountainBike2.setBrand("Giant");
    mountainBike2.speedAcc(20);
    mountainBike2.gearChanges(3);
    mountainBike2.printInfo();

    motor1.setBrand("Nmax");
    motor1.speedAcc(30);
    motor1.gearChanges(2);
    motor1.setMachineType("Matic");
    motor1.printInfo();


    }

}