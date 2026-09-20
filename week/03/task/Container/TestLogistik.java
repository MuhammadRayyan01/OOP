package week.three.task.Container;
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

        System.out.println("memasukkan muatan baru seberat:");
        weight = sc.nextInt();
        kontainerA.setCap(weight); 
        System.out.println("berat muatan saat ini: "+kontainerA.getCap()+ " kg");

        System.out.println("menurunkan berat: ");
        weight = sc.nextInt();
        kontainerA.decreaseWeight(weight); 
        System.out.println("berat muatan saat ini: "+ kontainerA.getCap());

    }
}
