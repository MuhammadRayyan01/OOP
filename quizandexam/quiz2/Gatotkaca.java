package quizandexam.quiz2;

public class Gatotkaca extends Hero {
public int Speed;
public Gatotkaca (String nama, int speed){
    this.Nama=nama;
    this.Speed=speed;
}    
public void attack(Killable ka){
    if(ka instanceof Evil){
        System.out.println("evil has been attacked by gatots");
    }else if( ka instanceof Villain){
        System.out.println("villain has been attacked by gatots");
    }
    
}
}

/*public void makanBuah(Buah x){ */
/* if (x instanceof Apel){
            System.out.println("apel langsung dimakan");
            ((Apel)x).tampilkanBiji();
        }
        else if(x instanceof Pisang){
            System.out.println("pisang dikupas terlebih dahulu");
            ((Pisang)x).tampilkanKulit();
        } else if (x instanceof Durian){
            System.out.println("The way to eat durian is to cut it open first");
            ((Durian)x).tampilkanDuri();
        }
        System.out.println("rasanya "+ x.Rasa);
        System.out.println("water content: "+ x.Water); */