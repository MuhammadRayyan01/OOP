package week.three.task;

import java.awt.Container;

public class TestLogistik {
    public static void main(String[] args) {
        Container kontainerA = new Container("2001","PT W",5000);

        System.out.println("Container owner name: "+kontainerA.getName());
        System.out.println("Max Capacity: "+kontainerA.getCap()+ " kg");

       

    }
}
