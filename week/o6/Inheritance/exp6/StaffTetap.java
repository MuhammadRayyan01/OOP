package week.o6.Inheritance.exp6;

public class StaffTetap extends Staff{
    public String Golongan;
    public int Asuransi;

    public StaffTetap(){
        
    }
    public StaffTetap(
        String name, String address, String jk,
        int age, int gaji, int lembur, int potongan,
        String golongan, int asuransi){
            super(name,address,jk,age,gaji,lembur,potongan);
            this.Golongan=golongan;
            this.Asuransi=asuransi;
    }
    public void showDataStaffTetap(){
        System.out.println("data staff tetap");
        super.showDataStaff();
        System.out.println("golongan:"+Golongan);
        System.out.println("jumlah asuransi:"+Asuransi);
        System.out.println("gaji bersih:"+(Gaji+Lembur+Potongan+Asuransi));
    }

    
}
