package week.o7.exp1;

public class Karyawan {
    private String Nama;
    private String Nip;
    private String Golongan;
    private double Gaji;

    public void setNama(String nama){
    this.Nama = nama;
    }
    public void setNip(String nip){
    this.Nip=nip;
    }
    public void setGolongan(String golongan){
        this.Golongan=golongan;

    switch(Golongan.charAt(0)){
        case '1':this.Gaji=5000000;
        break;
        case '2':this.Gaji=3000000;
        break;
        case '3':this.Gaji=2000000;
        break;
        case '4':this.Gaji=1000000;
        break;
        case '5':this.Gaji=750000;
        break;
    }
    }
    public void setGaji(double gaji){
        this.Gaji=gaji;
    }
    public String getNama(){
        return Nama;
    }
    public String getNip(){
        return Nip;
    }
    public String getGolongan(){
        return Golongan;
    }
    public Double getGaji(){
        return Gaji;
    }
}
