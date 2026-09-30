package week.o4.exp06;

public class MainExperiment6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptop.printDocument(printer, "Report.pdf");
    }
}
