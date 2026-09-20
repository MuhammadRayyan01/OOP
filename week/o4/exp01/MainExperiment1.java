package week.o4.exp01;

public class MainExperiment1 {
    public static void main(String[] args) {
    Processor p = new Processor("Intel i5", 3);
    Laptop l = new Laptop("Thinkpad", p);
    l.info();
    
    Processor p1 = new Processor();
    p1.setBrand("Intel i5");
    p1.setCache(4);

    Laptop l1 = new Laptop();
    l1.setBrand("Thinkpad");
    l1.setProc(p1);
    l1.info();

    Laptop l2 = new Laptop("Thinkpad",
    new Processor("Intel i5", 3));
    l2.info();
    }
}
