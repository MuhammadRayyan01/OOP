
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude sarjanaCumlaude){
        System.out.println("I am the rector, granting a cumlaude award");
        System.out.println("congrats! please introduce yourself");
    
        sarjanaCumlaude.lulus();
        sarjanaCumlaude.meraihIPKTertinggi();

        System.out.println("-------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi mahasiswaBerprestasi) {  
        System.out.println("I am the RECTOR, granting a MAWAPRES award.");  
        System.out.println("Congratulations! How did you achieve this?"); 
        mahasiswaBerprestasi.menjuaraiKompetisi(); 
        mahasiswaBerprestasi.membuatPublikasiIlmiah(); 
        System.out.println("---------------------------------");
        }
}
