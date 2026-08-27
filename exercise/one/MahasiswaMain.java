package exercise.one;
import java.util.Scanner;

public class MahasiswaMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("input name: ");
String nama = sc.nextLine();

System.out.print("input NIM: ");
String nim = sc.nextLine();

System.out.print("input umur: ");
int umur = sc.nextInt();

Mahasiswa mhs = new Mahasiswa(nama, nim, umur);

System.out.println("\ndata mahasiswa,NIM, dan umur:");
System.out.println("nama "+ mhs.nama);
System.out.println("NIM "+ mhs.nim);
System.out.println("umur"+ mhs.umur);

}
    
}
