package week.o6.Inheritance.exp6;

public class Manager extends Karyawan {
    public int tunjangan;
    public Manager(){
    } 

    public void showDataManager(){
        super.showData();
        System.out.println("tunjangan:"+tunjangan);
        System.out.println("total gaji:"+(super.Gaji + tunjangan));
    }
    
}
