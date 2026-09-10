package week.three;

public class Motor {
    private  int kecepatan=0;
    private  boolean kontakOn=false;

    public void nyalakanMesin(){
        kontakOn=true;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if(kontakOn==true){
            kecepatan+=5;
        }
        else{
        System.out.println("kecepatan tidak bisa bertambah karena mesin off"); 
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn==true){
        }else{
            System.out.println("kecepatan tidak bisa berkurang karena mesin off");
        }
    }
    public void printStatus(){
        if(kontakOn==true){
            System.out.println("kontak on");
        
        }else{
            System.out.println("kontak off");

        } if(kecepatan<100){
            kecepatan+=90;
            System.out.println("kecepatan "+ kecepatan+"\n");

        }else{
        System.out.println("speed is max");
    }
    }
}
