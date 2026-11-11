package quizandexam.quiz2;

public class CaptainIndonesia extends Hero{
    public int Level;
    public  CaptainIndonesia(String nama,int level){
        this.Nama=nama;
        this.Level=level;
        
    }
    public void attack(Killable ka){
        if(ka instanceof Evil){
        System.out.println("evil has been attacked by caps");
    }else if( ka instanceof Villain){
        System.out.println("villain has been attacked by caps");
    }
    }

    
}
