package week.o4.exp02;

public class Driver {
    private String name;
    private int cost;

    public Driver() {
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getName() {
    return name;
    }

    public void setCost(int cost) {
    this.cost = cost;
    }

    public int getCost() {
    return cost;
    }

    public int calculateDriverCost(int days) {
    return cost * days;
    }
}

