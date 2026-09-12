package week.three.task.Ticket;

public class Ticket {
    private String judulFilm;
    private Double hargaDasar;
    private boolean statusPembayaran;

    public Ticket(String judulFilm,Double hargaDasar){
        this.judulFilm=judulFilm;
        this.hargaDasar=hargaDasar;
        this.statusPembayaran=false;
    }

    public void setFilm(String name){
        judulFilm=name;
    }
    public String getFilm(){
        return judulFilm;
    }

    public void setHarga(double harga){
        if(harga<0){
            System.out.println("wrong input i guess, so i make it 35k");
            harga=35000;
            hargaDasar = harga;
        }else{
            hargaDasar = harga;
        }
    }
    public double getHarga(){
        if(hargaDasar<0){
            System.out.println("wrong input i guess, so i make it 35k");
            hargaDasar=35000.0;
        }
        return hargaDasar;
    }

    public boolean lakukanPembayaran(){
        statusPembayaran=true;
        return statusPembayaran;
    }
    public boolean isStatusPembayaran(){
        if(statusPembayaran==true){
            System.out.println("yes you have paid ");
        }else{
            System.out.println("nope, not yet you havent paid");
        }
        return statusPembayaran;
    }
}
