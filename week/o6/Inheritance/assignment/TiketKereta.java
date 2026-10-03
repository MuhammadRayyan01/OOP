package week.o6.Inheritance.assignment;

public class TiketKereta extends Tiket {
    protected int NomorGerbong;
    protected String NomorKursi;

    public TiketKereta(){

    }
    public TiketKereta(String kodeTiket,String namaPenumpang,String asal,
        String tujuan, int hargaDasar,int nomorGerbong,String nomorKursi){
    super(kodeTiket,namaPenumpang,asal,tujuan,hargaDasar);
    this.NomorGerbong=nomorGerbong;
    this.NomorKursi=nomorKursi;
    }
    public void showKereta(){
        super.showTicket();
        System.out.println("nomor gerbong:"+NomorGerbong);
        System.out.println("nomor kursi:"+ NomorKursi);
        System.out.println("total bayar:"+HargaDasar);
    }
}
