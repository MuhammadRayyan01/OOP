package week.o6.Inheritance.exp6;

public class Staff extends Karyawan {
    public int Lembur,Potongan;

    public Staff(){

    }
    public Staff(String name,String address,String jk,int age,int gaji,int lembur,int potongan){
        super(name,address,age,jk,gaji);
        this.Lembur=lembur;
        this.Potongan=potongan;
    }
    public void showDataStaff(){
        super.showData();
        System.out.println("lembur:"+Lembur);
        System.out.println("Potongan:"+Potongan);
        System.out.println("total gaji:"+(Gaji+Lembur-Potongan));
    }
    
}
