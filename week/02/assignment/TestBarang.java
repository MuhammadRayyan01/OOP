package week.two.assignment;

public class TestBarang{
    public static void main(String[]args){
        Barang item1= new Barang();
        Barang item2= new Barang();
        item1.kode="101";
        item1.namaBarang="coklat";
        item1.hargaDasar=20020;
        item1.diskon=0.5f;
        item1.viewData();
        System.out.println("sell price "+item1.hargaJual());
        item2.kode="102";
        item2.namaBarang="stroberi";
        item2.hargaDasar=30000;
        item2.diskon=0.3f;
        item2.viewData();
        System.out.println("sell price "+item2.hargaJual());
    }
    
}
