package week.three.task;
import java.util.Scanner;


public class TestLogistik {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Container kontainerA = new Container("2001","PT W",5000,0);

        

        System.out.println("Container owner name: "+kontainerA.getName());
        System.out.println("Max Capacity: "+kontainerA.getCap()+ " kg");

        System.out.print("memasukkan muatan baru dengan berat:");
        int weight = sc.nextInt();
        kontainerA.setCap(weight); 
        System.out.println("berat muatan saat ini "+kontainerA.getCap()+ " kg");

        System.out.println("memasukkan muatan baru seberat 4000kg");
        kontainerA.setCap(4000);
        System.out.println("berat muatan saat ini: "+kontainerA.getCap()+ " kg");

        System.out.println("menurunkan berat 5050kg");
        kontainerA.decreaseWeight(50050);
        System.out.println("berat muatan saat ini: "+ kontainerA.getCap());

    }
}
