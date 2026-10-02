package week.o6.Inheritance.exp6;

public class StaffHarian extends Staff{
    public int JmlJamKerja;

    public StaffHarian(){

    }
    public StaffHarian(
        String name, String address, String jk,
        int age, int gaji, int lembur, int potongan,
        int jmlJamKerja){
        super(name, address, jk, age, gaji, lembur, potongan);
        this.JmlJamKerja=jmlJamKerja;
    }    
    public void showDataStaffHarian(){
        System.out.println("data staff harian");
        super.showData();
        System.out.println("Jumlah jam kerja:"+JmlJamKerja);
        System.out.println("Gaji Bersih:"+(Gaji*JmlJamKerja+Lembur-Potongan));
    }
}
