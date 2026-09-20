package week.o2;

public class Barang {
    String name;
    String type;
    int stock;
    public void viewBarang(){
        System.out.println("item name: "+ name);
        System.out.println("item type: "+ type);
        System.out.println("stock: "+ stock);
    }
    public int addStock (int itemIn){
    int newStock=itemIn+stock;
        return newStock;
    }
    
}
