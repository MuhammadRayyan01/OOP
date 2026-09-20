package week.o4.exp01;

public class MainExperiment1 {
    public static void main(String[] args) {
    Processor p = new Processor("Intel i5", 3);
    Laptop l = new Laptop("Thinkpad", p);
    l.info();
    }
}
