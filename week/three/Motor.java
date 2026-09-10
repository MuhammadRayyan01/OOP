package week.three;

public class Motor {
    private int kecepatan=0;
    public boolean kontakOn=false;
    public void printStatus(){
        if(kontakOn==true){
            System.out.println("kontak on");
        
        }else{
            System.out.println("kontak off");

        }
        System.out.println("kecepatan "+ kecepatan+"\n");
    }
}
