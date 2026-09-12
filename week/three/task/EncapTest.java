package week.three.task;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(40);

        System.out.println("name: "+encap.getName());
        System.out.println("age: "+encap.getAge());
    }
}
