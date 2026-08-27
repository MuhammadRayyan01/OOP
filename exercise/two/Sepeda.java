package exercise.two;

public class Sepeda {
String merek;
int kecepatan;
int gear;

public void setMerek(String newValue){
    merek=newValue;
}
public void gantiGear(int newValue){
    gear=newValue;
}
public void tambahKecepatan(int increment){
    kecepatan= kecepatan + increment;
}
public void rem(int decrement){
    kecepatan = kecepatan - decrement;
}
public void cetakStatus(){
    System.out.println("merek "+ merek);
    System.out.println("gear "+ gear);
    System.out.println("kecepatan "+ kecepatan);
}
}
