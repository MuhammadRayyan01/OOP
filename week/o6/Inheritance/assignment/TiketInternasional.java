package week.o6.Inheritance.assignment;

public class TiketInternasional extends TiketPesawat{
protected String NomorPaspor;
protected int Asuransi;

public TiketInternasional(){

}
public TiketInternasional(String kodeTiket,
    String namaPenumpang,String asal,
    String tujuan, int hargaDasar,String maskapai,
    String nomorPaspor, int asuransi){
        super();
        this.NomorPaspor=nomorPaspor;
        this.Asuransi=asuransi;
        }
public void showInternasional(){
    super.showPesawat();
    System.out.println("nomor paspor:"+NomorPaspor);
    System.out.println("asuransi:"+ Asuransi);

}
    
}
