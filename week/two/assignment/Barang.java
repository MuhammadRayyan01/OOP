package week.two.assignment;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    public int hargaJual(){
        double sell= hargaDasar - (diskon * hargaDasar);
        return (int)sell;
    }
    public void viewData(){
        System.out.println("kode: "+kode);
        System.out.println("item name: "+namaBarang);
        System.out.println("basic price: "+hargaDasar);
        System.out.println("discount: "+diskon);
    }
    
}
