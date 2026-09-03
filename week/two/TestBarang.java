package week.two;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1=new Barang();
        brg1.name="pencil";
        brg1.type="ATK";
        brg1.stock=10;
        brg1.viewBarang();
        System.out.println("new stock: "+ brg1.addStock(20));
    }
    
}
