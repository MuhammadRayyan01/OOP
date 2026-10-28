package o10.pegawai;

public class Pegawai {
    protected String Nama;
    protected int Gaji;

    public Pegawai(){

    }
    public Pegawai(String nama, int gaji){
        this.Nama=nama;
        this.Gaji=gaji;
    }
    public int getGaji(){
        return Gaji;
    }

}
