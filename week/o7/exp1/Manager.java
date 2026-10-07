package week.o7.exp1;

public class Manager extends Karyawan {
    private Double Tunjangan ;
    private String Bagian;
    private Staff St[];

    public void setTunjangan(Double tunjangan){
        this.Tunjangan = tunjangan;
    }
    public Double getTunjangan(){
        return Tunjangan;
    }
    public void setBagian(String bagian){
        this.Bagian=bagian;
    }
    public String getBagian(){
        return Bagian;
    }
    public void setStaff(Staff st[]){
        this.St=st;
    }
    public void viewStaff(){
        int i;
        System.out.println("--------------");
        for ( i =0; i < St.length; i++) {
            St[i].showInfo();
        }
        System.out.println("--------------");
    }
    public void showInfo(){
        System.out.println("Manager: "+this.getBagian());
        System.out.println("NIP: "+this.getNip());
        System.out.println("Nama: "+this.getNama());
        System.out.println("Golongan: "+this.getGolongan());
        System.out.printf("Tunjangan:%.0f\n",this.getTunjangan());
        System.out.printf("Gaji :%.0f\n",this.getGaji());
        System.out.printf("Bagian :%s\n",this.getBagian());
        this.viewStaff();
    }
    public Double getGaji(){
        return super.getGaji()+Tunjangan;
    }

}
