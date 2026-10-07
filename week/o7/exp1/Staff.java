package week.o7.exp1;

public class Staff extends Karyawan{
    private int Lembur;
    private double GajiLembur;

    public void setLembur(int lembur){
        this.Lembur=lembur;
    }
    public int getLembur(){
        return Lembur;
    }
    public void setGajiLembur(double gajiLembur){
        this.GajiLembur=gajiLembur;
    }
    public double getGajiLembur(){
        return GajiLembur;
    }
    
    //overloading
    public double getGaji(int lembur,double gajiLembur){
        return super.getGaji()+Lembur*GajiLembur;
    }
    //overriding
    public Double getGaji(){
        return super.getGaji()+Lembur*GajiLembur;
    }
    public void showInfo(){
        System.out.println("NIP: "+this.getNip());
        System.out.println("nama: "+this.getNama());
        System.out.println("Golongan: "+this.getGolongan());
        System.out.println("Jumlah Lembur: "+this.getLembur());
        System.out.printf("Gaji Lembur:%.0f\n ",this.getGajiLembur());
        System.out.printf("Gaji:%.0f\n",this.getGaji());

    }
}
