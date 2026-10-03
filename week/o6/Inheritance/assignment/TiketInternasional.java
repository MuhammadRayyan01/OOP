package week.o6.Inheritance.assignment;

public class TiketInternasional extends TiketPesawat{
protected String NomorPaspor;
protected int Asuransi;

public TiketInternasional(){

}
public TiketInternasional(String kodeTiket,String namaPenumpang,String asal,
        String tujuan, int hargaDasar,String maskapai, int beratBagasi, String nomorPaspor, int asuransi){
        super(kodeTiket,namaPenumpang,asal,tujuan,hargaDasar,maskapai,beratBagasi);
        this.NomorPaspor=nomorPaspor;
        this.Asuransi=asuransi;
        }
public void showInternasional(){
    System.out.println("'=========INTERNASIONAL===========");
    super.showPesawat();
    System.out.println("nomor paspor:"+NomorPaspor);
    System.out.println("asuransi:"+ Asuransi);
    System.out.println("total bayar:"+(HargaDasar+hitungBiayaBagasi()+Asuransi));

}
    
}
