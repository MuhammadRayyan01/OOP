package week.o6.Inheritance.assignment;

public class TiketDomestik extends TiketPesawat {
    protected int PajakBandara;

    public TiketDomestik(){

    }
    public TiketDomestik(String kodeTiket,String namaPenumpang,String asal,
        String tujuan, int hargaDasar,String maskapai, int beratBagasi,int pajakBandara){
        super();
        this.PajakBandara=pajakBandara;
        }
    public void showDomestik(){
        this.showPesawat();
        System.out.println("pajak:"+PajakBandara);
    }
}
