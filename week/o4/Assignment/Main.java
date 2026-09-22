package week.o4.Assignment;

public class Main {
    public static void main(String[] args) {
        // 1. Create Machine (triggers Composition of Chamber internally)
        Machine composter = new Machine("EcoComp-v1");

        // 2. Create Operator and assign Machine (Aggregation)
        Operator operator = new Operator("Alex");
        operator.setMachine(composter);

        // 3. Create Printer and pass to method (Dependency)
        ReportPrinter printer = new ReportPrinter();
        operator.printReport(printer);
    }
}
