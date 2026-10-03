package week.o6.Inheritance.assignment;

public class Tiket {
    protected String KodeTiket;
    protected String NamaPenumpang;
    protected String Asal;
    protected String Tujuan;
    protected int HargaDasar;

    public Tiket(){

    }
    public Tiket(String kodeTiket,String namaPenumpang,String asal,
        String tujuan, int hargaDasar){
            this.KodeTiket=kodeTiket;
            this.NamaPenumpang=namaPenumpang;
            this.Asal=asal;
            this.Tujuan=tujuan;
            this.HargaDasar=hargaDasar;
    }
    public void showTicket(){
        System.out.println(KodeTiket);
        System.out.println(NamaPenumpang);
        System.out.println(Asal+" ke "+Tujuan);
        System.out.println(HargaDasar);
        
    }
    
}
