package week.o6.Inheritance.exp5;

public class Staff extends Karyawan {
    public int Lembur,Potongan;

    public Staff(){

    }
    public Staff(String name,String address,String jk,int age,int lembur,int potongan){
        super(Name,Address,Jk,Age,Gaji);
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
