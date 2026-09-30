package week.o4.Assignment;

public class Machine {
    private String model;
    private Chamber chamber; // Composition attribute

    public Machine(String model) {
        this.model = model;
        // COMPOSITION: 'new' is called directly inside the constructor
        this.chamber = new Chamber("Layer 1: Shredder & Sterilization");
    }

    public String getModel() {
        return model;
    }

    public Chamber getChamber() {
        return chamber;
    }
}
