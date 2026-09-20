package week.o4.exp02;

public class MainExperiment02 {
public static void main(String[] args) {
    Car m = new Car();
    m.setBrand("Avanza");
    m.setCost(350000);
    Car a = new Car();

    Driver s = new Driver();
    s.setName("John Doe");
    s.setCost(200000);

    Customer p = new Customer();
    p.setName("Jane Doe");
    p.setCar(a);
    p.setDriver(s);
    p.setDays(2);

    System.out.println("Total Cost = " + p.calculateTotalCost());
    System.out.println(p.getCar().getBrand());
    }
    
}
