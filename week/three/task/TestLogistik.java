package week.three.task;


public class TestLogistik {
    public static void main(String[] args) {
        Container kontainerA = new Container("2001","PT W",5000,0);

        System.out.println("Container owner name: "+kontainerA.getName());
        System.out.println("Max Capacity: "+kontainerA.getCap()+ " kg");

        System.out.println("memasukkan muatan baru seberat 6000kg");
        kontainerA.setCap(6000);
        System.out.println("berat muatan saat ini "+kontainerA.getCap()+ " kg");

        System.out.println("memasukkan muatan baru seberat 4000kg");
        kontainerA.setCap(4000);
        System.out.println("berat muatan saat ini: "+kontainerA.getCap()+ " kg");

    }
}
