package week.o4.exp06;

public class Printer {
    private String brand;
    public Printer(String brand){
        this.brand=brand;
    }
    public void print(String filename){
        System.out.println("["+brand+"] Printing "+filename+"...");
        System.out.println("["+brand+"] done.");
    }
    
}
