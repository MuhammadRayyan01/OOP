package o10.exp0;

public class Manusia {
    public void makanBuah(Buah x){
        if (x instanceof Apel){
            System.out.println("apel langsung dimakan");
            ((Apel)x).tampilkanBiji();
        }
        else if(x instanceof Pisang){
            System.out.println("pisang dikupas terlebih dahulu");
            ((Pisang)x).tampilkanKulit();
        }
        System.out.println("rasanya "+ x.Rasa);
    }
    
}
