package week.o4.exp06;

public class Laptop {
    private String brand;
    
    public Laptop(String brand){
    this.brand=brand;
    }
    public void printDocument(Printer printer,String filename){
        System.out.println(brand +" is sending a document to the printer..");
        printer.print(filename);
    }
}
