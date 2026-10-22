package week.o9.exp2;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude sarjanaCumlaude){
        System.out.println("I am the rector, granting a cumlaude award");
        System.out.println("congrats! please introduce yourself");
    
        sarjanaCumlaude.lulus();
        sarjanaCumlaude.meraihIPKTertinggi();

        System.out.println("-------------------------------");
    }

}
