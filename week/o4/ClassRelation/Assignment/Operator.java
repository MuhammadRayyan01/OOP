package week.o4.Assignment;

public class Operator {
    private String name;
    private Machine machine; // AGGREGATION attribute

    public Operator(String name) {
        this.name = name;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public void printReport(ReportPrinter printer) {
        String data = "Operator: " + name + " | Machine: " + machine.getModel() 
                    + " | Active Chamber: " + machine.getChamber().getLayerName();
        printer.print(data);
    }
}
