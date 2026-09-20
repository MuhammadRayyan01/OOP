package week.three.task.Ticket;

public class TestBioskop {
    public static void main(String[] args) {
        Ticket tik1= new Ticket("Avenger doomsday",-5000.00);
        System.out.println("film: "+tik1.getFilm());
        System.out.println("harga tiket: "+tik1.getHarga());
        System.out.println("status lunas?"+tik1.isStatusPembayaran());

        System.out.println("memproses pembayaran..");
        tik1.lakukanPembayaran();
        System.out.println("status lunas terbaru?: "+tik1.isStatusPembayaran());
    }
}
