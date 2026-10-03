package week.o6.Inheritance.assignment;

public class TiketDomestik extends TiketPesawat {
    protected int PajakBandara;

    public TiketDomestik(){

    }
    public TiketDomestik(String kodeTiket,String namaPenumpang,String asal,
        String tujuan, int hargaDasar,String maskapai, int beratBagasi,int pajakBandara){
        super(kodeTiket,namaPenumpang,asal,tujuan,hargaDasar,maskapai,beratBagasi);
        this.PajakBandara=pajakBandara;
        }
    public void showDomestik(){
        System.out.println("==========DOMESTIK===========");
        this.showPesawat();
        System.out.println("pajak:"+PajakBandara);
        System.out.println("total bayar:"+(HargaDasar+hitungBiayaBagasi()+PajakBandara));
    }
}
