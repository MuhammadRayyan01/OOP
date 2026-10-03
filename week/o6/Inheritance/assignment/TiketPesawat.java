package week.o6.Inheritance.assignment;

public class TiketPesawat extends Tiket {
    protected String Maskapai;
    protected int BeratBagasi; 

    public TiketPesawat(){

    }
    public TiketPesawat(String kodeTiket,String namaPenumpang,String asal,
        String tujuan, int hargaDasar,String maskapai, int beratBagasi){
        super(kodeTiket,namaPenumpang,asal,tujuan,hargaDasar);
        this.Maskapai=maskapai;
        this.BeratBagasi=beratBagasi;
        }
    public int hitungBiayaBagasi(){
        if(BeratBagasi<20){
            return 0;
        }else{
            return (BeratBagasi-20)*50000;
        }
    }
    public void showPesawat(){
        super.showTicket();
        System.out.println(BeratBagasi);
        System.out.println(hitungBiayaBagasi());
    }
}
