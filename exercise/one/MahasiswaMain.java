package exercise.one;
import java.util.Scanner;

public class MahasiswaMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("input name: ");
String Nama = sc.nextLine();

System.out.print("input NIM: ");
String NIM = sc.nextLine();

System.out.print("input umur: ");
int Umur = sc.nextInt();

MahasiswaMain mhs = new MahasiswaMain();

System.out.println("\n data mahasiswa,NIM, dan umur:");
System.out.println("nama "+ Nama);
System.out.println("NIM "+ NIM);
System.out.println("umur"+ Umur);

}
    
}
