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
        String tujuan, int HargaDasar){
    }
    public void showTicket(){
        System.out.println(KodeTiket);
        System.out.println(NamaPenumpang);
        System.out.println(Asal);
        System.out.println(Tujuan);
        System.out.println(HargaDasar);
    }
    
}
